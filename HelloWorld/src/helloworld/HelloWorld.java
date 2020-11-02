/**
 * 
 */
package helloworld;

import java.awt.Color;
import java.awt.Toolkit;

import mmb.MODS.info.AddonCentral;
import mmb.MODS.info.ModMetadata;
import mmb.WORLD.tileworld.DrawerPlainColor;
import mmb.WORLD.tileworld.block.Block;
import mmb.WORLD.tileworld.block.Blocks;
import mmb.debug.Debugger;

/**
 * @author oskar
 *
 */
public class HelloWorld implements AddonCentral {
	private static Debugger debug = new Debugger("HW");
	public static final Block bHelloWorld;
	/**
	 * 
	 */
	public HelloWorld() {
		debug.printl("Hello, world!");
	}

	static {
		bHelloWorld = new Block();
		bHelloWorld.texture = new DrawerPlainColor(Color.LIGHT_GRAY);
		bHelloWorld.update = (e) -> {
			Block[] n = e.world.getNeighbors4(e.block);
			for(int i = 0; i < n.length; i++) {
				if(n[i] == Blocks.ww_head) {
					debug.printl("Hello, world!");
					return;
				}
			}
		};
		bHelloWorld.register("wireworld.beep");
	}
	/* (non-Javadoc)
	 * @see mmb.addon.module.AddonCentral#info()
	 */
	@Override
	public ModMetadata info() {
		ModMetadata info = new ModMetadata();
		info.author = "Monniasza";
		info.description = "Hello, World in Machine Builder";
		info.name = "Hello, world!";
		return info;
	}

	/* (non-Javadoc)
	 * @see mmb.addon.module.AddonCentral#firstOpen()
	 */
	@Override
	public void firstOpen() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see mmb.addon.module.AddonCentral#makeContent()
	 */
	@Override
	public void makeContent() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see mmb.addon.module.AddonCentral#integrationModules()
	 */
	@Override
	public void integrationModules() {
		// TODO Auto-generated method stub
		
	}

}
