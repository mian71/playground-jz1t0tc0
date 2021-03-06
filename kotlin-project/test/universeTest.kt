

import java.io.File;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

class UniverseTest {

	@Test fun test() {
		try {
			Assert.assertEquals("Running countAllStars(2, 3)...", 5, countAllStars(2, 3))
			Assert.assertEquals("Running countAllStars(9, -3)...", 6, countAllStars(9, -3))
			success(true)

			if (existsInFile("galaxies.sum()", File("./src/universe.kt"))) {
				msg("My personal Yoda, you are. π", "* β ΒΈ .γΒΈ. :Β° βΎ Β° γΒΈ. β ΒΈ .γγΒΈ.γ:. β’ ")
				msg("My personal Yoda, you are. π", "           γβ Β°  β ΒΈ. ΒΈ γβγ :.γ .   ")
				msg("My personal Yoda, you are. π", "__.-._     Β° . .γγγγ.γβΎ Β° γ. *   ΒΈ .")
				msg("My personal Yoda, you are. π", "'-._\\7'      .γγΒ° βΎ  Β° γΒΈ.β  β .γγγ")
				msg("My personal Yoda, you are. π", " /'.-c    γ   * β  ΒΈ.γγΒ°     Β° γΒΈ.    ")
				msg("My personal Yoda, you are. π", " |  /T      γγΒ°     Β° γΒΈ.     ΒΈ .γγ  ")
				msg("My personal Yoda, you are. π", "_)_/LI");
			} else {
				msg("Kudos π", "Did you know that in Kotlin you can use the sum() function directly on an Array? Try it!")
				msg("Kudos π", "")
				msg("Kudos π", "var galaxies = arrayOf(37, 3, 2)")
				msg("Kudos π", "var totalStars = galaxies.sum() // 42")
			}
		} catch (ae: AssertionError) {
			success(false)
			msg("Oops! π", ae.message)
			msg("Hint π‘", "Did you properly accumulate all stars into 'totalStars'? π€")
		}
	}

	fun msg(channel: String, msg: String?) {
		System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg))
	}

	fun success(success: Boolean) {
		System.out.println(String.format("TECHIO> success %s", success))
	}

	// check if a string exists in a text file
	fun existsInFile(str: String, file: File): Boolean {
		val scanner = Scanner(file)
		try {
			while (scanner.hasNextLine()) {
				if (scanner.nextLine().contains(str))
					return true
			}
			return false;
		} finally {
			scanner.close()
		}
	}
}
