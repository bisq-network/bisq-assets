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

public class ParsiCoinTest extends AbstractAssetTest {
    public ParsiCoinTest() {
        super(new ParsiCoin());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("hyrjMmPhaznQkJD6C9dcmbBH9y6r9vYAg2aTG9CHSzL1R89xrFi7wj1azmkXyLPiWDBeTCsKGMmr6JzygbP2ZGSN2JqWs1WcK");
        assertValidAddress("hysGnTgR53FfchPUN6cehsChMihzJJwiuFxzxWnLUWF3UqHeaX4TEwz9GubvxU6uur3tp6M5LW2UdddLjMhsmNpY2wDJECxCR");
        assertValidAddress("hyr3Lqhqyx58mptQPyX2HGhpAKicB8rDeg1skAaT2FA747RLkKk8jkm6qw4gAm97WcaypimApB8aSPsfSPEZKAwi1wheJ1Hr2");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("gyr3Lqhqyx58mptQPyX2HGhpAKicB8rDeg1skAaT2FA747RLkKk8jkm6qw4gAm97WcaypimApB8aSPsfSPEZKAwi1wheJ1Hr2");
        assertInvalidAddress("iysGnTgR53FfchPUN6cehsChMihzJJwiuFxzxWnLUWF3UqHeaX4TEwz9GubvxU6uur3tp6M5LW2UdddLjMhsmNpY2wDJECxCR");
        assertInvalidAddress("");
        assertInvalidAddress("hyr3Lqhqyx58mptQPyX2HGhpAKicB8rDeg1skAaT2FA747RLkKk8jkm6qw4gAm97WcaypimApB8aSPsfSPEZKAwi1wJ1Hr2");
        assertInvalidAddress("1Ns4XxNcte21oodqQH73j3eWryYpzZEPdX");
    }
}
