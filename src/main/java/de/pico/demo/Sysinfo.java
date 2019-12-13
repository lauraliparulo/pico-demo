package de.pico.demo;

import java.util.concurrent.Callable;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "sysinfo", header = "%n@|green Welcome to sysinfo|@",
		  subcommands = {
		      HardwareInfo.class,
		      OperativeSystemInfo.class
		  }
		)
public class Sysinfo implements Callable<Integer> {

	@Option(names = { "-u", "--user" }, required = true, description = "The user name.")
	String userName;

	@Option(names = { "-h", "--help" }, description = "Display help/usage.", help = true)
	boolean help;

	public void run() {

//	  if (main.help)
//	  {
//	     CommandLine.usage(main, out, CommandLine.Help.Ansi.AUTO);
//	  }

		System.out.println("Hello, " + userName);
	}

	public static void main(String... args) {
//	  ParseResult parseResult;
//  	CommandLine.executeHelpRequest(parseResult)

		int exitCode = new CommandLine(new Sysinfo()).execute(args);
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
