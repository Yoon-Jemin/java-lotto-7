package lotto.controller;

import lotto.domain.lotto.Bonus;
import lotto.domain.lotto.Lotto;
import lotto.domain.player.Player;
import lotto.service.LottoService;
import lotto.service.PlayerService;
import lotto.util.Validator;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {

    private final InputView inputView;
    private final OutputView outputView;

    private final LottoService lottoService;
    private final PlayerService playerService;

    private final Lotto lotto;
    private final Player player;
    private final Bonus bonus;

    public LottoController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.lotto = new Lotto();
        this.player = new Player();
        this.bonus = new Bonus();
        this.lottoService = new LottoService(lotto, bonus);
        this.playerService = new PlayerService(player, lotto, bonus);
    }

    public void run() {
        purchaseLotto();
    }

    private void purchaseLotto() {
        outputView.printPriceInputMessage();
        int purchasePrice = inputView.readPriceInput();
    }
}