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

public class MonetaryUnitTest extends AbstractAssetTest {

    public MonetaryUnitTest() {
        super(new MonetaryUnit());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("7bYi4aBgAj1bPDC7V7qG5QvKQpDSt3guMs");
        assertValidAddress("7XqZ9YSN6gehD2EW8DJLSQPFHhxYDK9Mp9");
        assertValidAddress("7VsbJmhe198NEFA6W4jYizjszvse3LXhWY");
        assertValidAddress("7VEPBjVtosR6zGEcFrXSJvXX7HTiijXVhF");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("17bYi4aBgAj1bPDC7V7qG5QvKQpDSt3guMs");
        assertInvalidAddress("17XqZ9YSN6gehD2EW8DJLSQPFHhxYDK9Mp9");
        assertInvalidAddress("sVsbJmhe198NEFA6W4jYizjszvse3LXhWY");
        assertInvalidAddress("sVEPBjVtosR6zGEcFrXSJvXX7HTiijXVhF");
        assertInvalidAddress("1asdasd");
        assertInvalidAddress("asdasd");
    }
}
