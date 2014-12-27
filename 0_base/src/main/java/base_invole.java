import groovy.lang.GroovyShell;

import java.io.File;
import java.io.IOException;

/**
 * Created by ZuoYun on 2014/12/24.
 * Time: 21:36
 * Information:
 *
 */

public class base_invole {
    public static void main(String[] args) throws IOException {
        GroovyShell shell = new GroovyShell();
        System.out.println(shell.evaluate(new File("0_base/src/groovy/base.groovy")).toString());
    }
}
