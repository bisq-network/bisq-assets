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

import org.junit.Test;

public class AlphaTest extends AbstractAssetTest {

    public AlphaTest() {
        super(new Alpha());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("ATypLuK6Ny72NYURxVi9CgoQeaoiXr19pz");
        assertValidAddress("ARJet2h7jbRPHjyrQkRaHm5v6p5VKf8iX5");
        assertValidAddress("AWep8apUiYBbjMqpapeNVDaASjsPnJDBra");
        assertValidAddress("AZTM5qiBkh3Fo1SaeTZyfBHexTDbJZjXeg");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("AsfasfashfqwfhAFSFASFASFASFASFASF");
        assertInvalidAddress("ARJet2h7jbRPHjyqwrqwrkRaHm5v6p5VKf8iX5");
        assertInvalidAddress("AWep8apUsfasfggMqpapeNqwaASjsPnJDBra");
		assertInvalidAddress("Asdgasgasgjasjgasjgjasgjasjsajasjasf");
    }
}
