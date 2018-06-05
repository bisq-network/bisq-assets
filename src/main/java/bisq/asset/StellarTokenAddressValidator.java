/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.asset;

import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Validates whether a stellar address has the necessary trustline
 * established to receive the token. The validator uses the stellar
 * horizon network to do the lookup.
 *
 * @author Peter Molnar/litlp007
 * @since 0.7.0
 */
public class StellarTokenAddressValidator implements AddressValidator {

   private String code;
   private String issuer;

   public static String getText(String url) throws Exception {
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                    connection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null)
            response.append(inputLine);

        in.close();

        return response.toString();
    }

    public StellarTokenAddressValidator(String code, String issuer) {
        this.code = code;
	this.issuer = issuer;
    }

    @Override
    public AddressValidationResult validate(String address) {
        try {
	    if ( address == "" || address.matches(".*[^a-zA-Z0-9].*") )
		    return AddressValidationResult.invalidStructure();
            String accountdata = this.getText("https://horizon.stellar.org/accounts/"+address);
	    if ( accountdata.matches(".*\"asset_code\": \"" + this.code + "\",[^}]*\"asset_issuer\": \"" + this.issuer + "\".*") )
                    return AddressValidationResult.validAddress();
        } catch (Exception e) {
            return AddressValidationResult.invalidStructure();
        }
        return AddressValidationResult.invalidStructure();
    }
}
