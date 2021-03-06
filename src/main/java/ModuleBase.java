import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.entities.*;

public abstract class ModuleBase {
    String command;
    MessageReceivedEvent event;
    MessageChannel channel;
    User user;
    Member member;
    Guild guild;

    public ModuleBase(MessageReceivedEvent event){
        this.command = event.getMessage().getContentRaw();
        this.event = event;
        this.channel = event.getChannel();
        this.user = event.getAuthor();
        this.member = event.getMember();
        this.guild = event.getGuild();
        process();
    }
    public abstract void process();
}
