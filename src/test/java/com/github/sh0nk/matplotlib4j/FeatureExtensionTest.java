package com.github.sh0nk.matplotlib4j;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.util.Arrays;

public class FeatureExtensionTest {
    private static final boolean DRY_RUN = true;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testMarker() throws IOException, PythonExecutionException {
        Plot plt = new PlotImpl(DRY_RUN);
        plt.plot()
                .add(Arrays.asList(1, 2))
                .marker("o");
        plt.show();
    }
}
