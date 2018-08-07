package bisq.asset.coins;
import bisq.asset.Coin;
import bisq.asset.RegexAddressValidator;
public class UltraNote extends Coin {
    public UltraNote() {
        super("UltraNote", "XUN", new RegexAddressValidator("(Xun3).{94}"));
    }
}
