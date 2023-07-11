package qwe.rty.abc;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ClassB.class, ClassC.class})

public class ExecuteAll {
public static void main(String[] args) {
	Result r = JUnitCore.runClasses(ClassB.class, ClassC.class);
	
}
}
