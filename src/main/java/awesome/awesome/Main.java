package awesome.awesome;

import awesome.awesome.commend;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.ScoreboardManager;


public class Main extends JavaPlugin implements Listener {
    private Scoreboard scoreboard;
    private Objective objective;
    private Score score;

    @Override
    public void onEnable() {
        getLogger().info("★Plugin [✔]");
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("능력치설정").setExecutor(new commend());
    }

    @Override
    public void onDisable() {
        getLogger().info("★Plugin [❌]");

    }

    @EventHandler
    public void setting(PlayerJoinEvent e){
        Player player = e.getPlayer();
        setScoreboard(player);
    }
    public void setScoreboard(Player player){
        ScoreboardManager scoreboardManager= Bukkit.getScoreboardManager();
        scoreboard=scoreboardManager.getNewScoreboard();
        objective=scoreboard.registerNewObjective("stat","stat");
        score=objective.getScore("공격력");
        score=objective.getScore("방어력");
        score=objective.getScore("체력");
        score=objective.getScore("이동속도");

    }
}
