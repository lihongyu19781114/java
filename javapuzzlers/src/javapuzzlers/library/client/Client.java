/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.library.client;

import javapuzzlers.library.Api;

/**
 * This class must make use of some member or constructor exported by
 * library.Api, such that this class (client.Client) compiles if and only if
 * the commented-out private declaration in the source file for library.Api
 * remains commented out.
 */
public class Client {
	String s = Api.newString();
}
