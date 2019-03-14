package racing.application;

import racing.infrastructure.RandomCondition;
import racing.ui.GameConsole;
import racing.ui.GameReady;
import racing.view.RacingRequestView;

public class App {

    public static void main(String[] args) {
        RacingRequestView request = GameReady.set();
        RacingGame game = new RacingGame(request, new RandomCondition());

        GameConsole.initShow(game.getViews());

        RacingGameResult result = game.start();
        GameConsole.resultShow(result);
    }
}