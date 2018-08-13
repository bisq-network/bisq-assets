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

public class ViacoinTest extends AbstractAssetTest {

    public ViacoinTest() {
        super(new Viacoin());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("VdMPvn7vUTSzbYjiMDs1jku9wAh1Ri2Y1A");
        assertValidAddress("EPt5g6LookySkqUNTwky24wTvzNrmKDP7r");
        assertValidAddress("EVt5ypcAfiCccFrdHxPbFwnEo5WDevawM7");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("1LgfapHEPhZbRF9pMd5WPT35hFXcZS1USrW");
        assertInvalidAddress("VgfapHEPhZbdRF9pMd5WPT35hFXcZS1USrW");
        assertInvalidAddress("EgfapHEPhZbRF9pMd5WPT35hFXcZS1USrW#");
    }
}
