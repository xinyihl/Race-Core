package online.yudream.racecore.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bukkit.Color;
import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.Team;

import java.util.List;

/**
 * team
 * @author SiberianHusky
 * @date 2024-5-21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseTeam {
    public static int teamNumber = 0;
    private int id;
    private int score=0;
    private OfflinePlayer captain;
    private String displayName;
    private Color color;
    private List<OfflinePlayer> members;
    private Team team;

    public String getMembersString(){
        String text = "";
        for (OfflinePlayer player: members){
            text+=(player.getName())+"\n";
        }
        return text;
    }
}
