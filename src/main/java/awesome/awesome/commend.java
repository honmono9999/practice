package awesome.awesome;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

public class commend implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player=(Player) sender;
        Scoreboard scoreboard=player.getScoreboard();
        float speed=scoreboard.getObjectives().size();
        if(args[0]=="공격력")
        {
            if (args[1].equals("set")){

            }
            else if (args[1].equals("add")){

            }
            else player.sendMessage("몰?루1");
        }
        else if (args[0]=="방어력")
        {
            if (args[1].equals("set")){

            }
            else if (args[1].equals("add")){

            }
            else player.sendMessage("몰?루1");
        }
        else if(args[0]=="체력")
        {
            if (args[1].equals("set")){

            }
            else if (args[1].equals("add")){

            }
            else player.sendMessage("몰?루1");
        }
        else if(args[0]=="이동속도")
        {
            if (args[1].equals("set")){
                player.setWalkSpeed(Float.parseFloat(args[2]));
            }
            else if (args[1].equals("add")){
                player.setWalkSpeed(+Float.parseFloat(args[2]));
            }
            else player.sendMessage("몰?루1");
        }
        else player.sendMessage("몰?루");
        return false;
    }
}
