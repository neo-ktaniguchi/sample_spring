package jp.ad.iij.nusso.nusso_batch.sample_spring_batch_tasklet.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class SampleTasklet implements Tasklet {

    @Override
    @Nullable
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext)
            throws Exception {
        try {
            // ここに処理を記述
            System.out.println("SampleTasklet started.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return RepeatStatus.FINISHED;
    }
}
