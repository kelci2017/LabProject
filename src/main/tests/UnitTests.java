package main.tests;

import main.Enums.StorageErrorInfo;
import main.Enums.StorageType;
import main.base.ISustainable;
import main.classes.RPAnnotationClass;
import main.classes.RPCommentClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTests {

    @Test
    public void testRPAnnotationClass(){
        RPAnnotationClass pRAnnotation = new RPAnnotationClass();
        for (StorageType storageType:StorageType.values()) {
            StorageErrorInfo storageErrorInfo = pRAnnotation.save(storageType);
            if (storageErrorInfo == StorageErrorInfo.noError) {
                ISustainable data = pRAnnotation.retrieve(storageType);
                if (data != null && data instanceof RPAnnotationClass) {
                        RPAnnotationClass instance = (RPAnnotationClass) data;
                        assertEquals(instance.annotation1, pRAnnotation.annotation1);
                        assertEquals(instance.annotation2, pRAnnotation.annotation2);
                        assertEquals(instance.annotation3, pRAnnotation.annotation3);
                }
            }
        }
    }

    @Test
    public void testRPCommentClass(){
        RPCommentClass pRComment = new RPCommentClass();
        for (StorageType storageType:StorageType.values()) {
            StorageErrorInfo storageErrorInfo = pRComment.save(storageType);
            if (storageErrorInfo == StorageErrorInfo.noError) {
                ISustainable data = pRComment.retrieve(storageType);
                if (data != null && data instanceof RPCommentClass) {
                        RPCommentClass instance = (RPCommentClass) data;
                        assertEquals(instance.comment1, pRComment.comment1);
                        assertEquals(instance.comment2, pRComment.comment2);
                        assertEquals(instance.comment3, pRComment.comment3);
                }
            }
        }
    }
}
