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

public class CompassTest extends AbstractAssetTest {

    public CompassTest() {
        super(new Compass());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("cBHPUpKgLsPSS2BUgchhLps6DAjXTSGWoo");
        assertValidAddress("BvQpKvb1SswwxVTuyZocHWCVsUeGq7MwoR");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("cBHPUpKgLsPSS2BUgchhLps6DAjXTSGWooX");
        assertInvalidAddress("cBHPUpKgLsPSS2BUgchhLps6DAjXTSGWo");
        assertInvalidAddress("cBHPUpKgLsPSS2BUgchhLps6DAjXTSGWoo#");
        assertInvalidAddress("bvQpKvb1SswwxVTuyZocHWCVsUeGq7MwoR");
        assertInvalidAddress("yidkVmR8GaT3oQthbm6jVxG5R7LnLVAvKwX");
    }
}
