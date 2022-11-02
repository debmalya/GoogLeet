package twitter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumGeneticMutationTest {

	MinimumGeneticMutation minimumGeneticMutation = new MinimumGeneticMutation();

	@Test
	void testMinMutation() {
		assertEquals(1, minimumGeneticMutation.minMutation("AACCGGTT", "AACCGGTA", new String[] { "AACCGGTA" }));
		assertEquals(2, minimumGeneticMutation.minMutation("AACCGGTT", "AAACGGTA",
				new String[] { "AACCGGTA", "AACCGCTA", "AAACGGTA" }));
		assertEquals(-1, minimumGeneticMutation.minMutation("AACCTTGG", "AATTCCGG",
				new String[] { "AATTCCGG", "AACCTGGG", "AACCCCGG", "AACCTACC" }));
	}

}
