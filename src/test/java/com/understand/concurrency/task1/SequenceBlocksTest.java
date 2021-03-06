package com.understand.concurrency.task1;

import com.understand.concurrency.utils.ThreadUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SequenceBlocksTest {

    private List<Character> blocks = Collections.synchronizedList(Arrays.asList('A', 'B', 'C', 'D'));

    @Test
    public void testBuild() throws Exception {
        SequenceBlocks.build(blocks);
        while (SequenceBlocks.result.size() != blocks.size()) ThreadUtils.sleep(1);
        Assert.assertEquals(blocks, SequenceBlocks.result);
    }
}