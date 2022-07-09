package inheritance;

public class Wizard extends Muggle{
	//constructor	
	public Wizard(String n) {
		super(n);
	}
	
	//methods that a wizard can do
	public String castSpell() {
		return getName() + " casts the 'alohomora' spell.";
	}
	
	public String rideBroom() {
		return getName() + " rides their broom.";
	}
	@Override
	public boolean isMagic() {
		return true;
	}
}
