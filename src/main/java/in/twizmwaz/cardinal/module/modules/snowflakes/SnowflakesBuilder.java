package in.twizmwaz.cardinal.module.modules.snowflakes;

import in.twizmwaz.cardinal.match.Match;
import in.twizmwaz.cardinal.module.ModuleBuilder;
import in.twizmwaz.cardinal.module.ModuleCollection;

public class SnowflakesBuilder implements ModuleBuilder {

    @Override
    public ModuleCollection load(Match match) {
        ModuleCollection<Snowflakes> results = new ModuleCollection<>();
        results.add(new Snowflakes());
        return results;
    }

}
