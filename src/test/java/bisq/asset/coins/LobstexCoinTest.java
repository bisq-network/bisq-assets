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

public class LobstexCoinTest extends AbstractAssetTest {
    public LobstexCoinTest() {
        super(new LobstexCoin());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("5252370ec3a7e63b3b2fca49ab6a9dea58a6deaf9ecd1a715c2e04517df2cc43");
        assertValidAddress("1MEbUJ5v5MdDEqFJGz4SZp58KkaLdmXZ85");
        assertValidAddress("34dvotXMg5Gxc37TBVV2e5GUAfCFu7Ms4g");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("");
    }
}
