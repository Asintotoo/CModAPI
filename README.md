## CModAPI - The Official API for CMod

**Note**: These features is still *Work in Progress*, this might not work as intended!

How to include the API:
Simple download the latest version from [here](https://github.com/Asintotoo/CModAPI/releases) and include it in your Spigot Plugin.
Make sure it is the same version as CMod's in order to use the API full potential.

Current Features:
- Event *CModFlagEvent* fired when a flag is sent
- Event *CModPunishmentEvent* fired when a punishment is run
- Enum *CheckType* which contains all the current checks avaible in the plugin

Example Usage:
```java
public class YourEvent implements Listener{
	
	@EventHandler
	public void onCModFlag(CModFlagEvent event) {
		if(event.getCheckType == CheckType.CHAT_A) {
			Player p = event.getPlayer();
			p.sendMessage("You got lucky! I cancelled the event, you won't be punished!")
			event.setCancelled(true);
		}
		
	}
}
```
This will check if the flag referes to a "Chat A" check and, if so, it will cancel the event and send a message to the player.
