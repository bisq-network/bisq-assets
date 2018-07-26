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

package bisq.asset.coins;

import bisq.asset.AbstractAssetTest;


public class ImageCoinTest extends AbstractAssetTest {

    public ImageCoinTest() {
        super(new ImageCoin());
    }


    @Override
    public void testValidAddresses() {
        assertValidAddress("MeUPKv7kysQUqwdmAP3RgN7rFnmCyeWoKW");
        assertValidAddress("MgejDHAMz5vvSZ3Gm98FxTzdESNjGoknot");
        assertValidAddress("MkgNFjWYsrHVdo9N1Da4PVwy1kAr1ddv7Q");
        assertValidAddress("McQTDa7ksEvqQXtYvBzDU1XsHetWxraB6W"); 
    }

    @Override
    public void testInvalidAddresses() {
        assertInvalidAddress("1fXBhPhSxx1wqxGQCryfgn6iU1M1XFUuCo32");
        assertInvalidAddress("CMde7YERCFWkCL2W5i8uyJmnpCVj8Chh");
        assertInvalidAddress("CcbqU3MLZuGAED2CuhUkquyJxKaSJqv6V6");
        assertInvalidAddress("bKaig5pznaUgiLqe6WkoCNGagNMhNLtqhKkggg");
    }
}
