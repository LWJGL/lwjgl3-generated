/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;


@FunctionalInterface
public interface YGMeasureFuncI extends CallbackI.J {

    String SIGNATURE = "(pfifi)l";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgFloat(args),
            dcbArgInt(args),
            dcbArgFloat(args),
            dcbArgInt(args)
        );
    }

    /**
     * Use {@link YGMeasureFunc#toLong toLong} to create the return value.
     *
     * @param node       
     * @param width      
     * @param widthMode  
     * @param height     
     * @param heightMode 
     */
    long invoke(long node, float width, int widthMode, float height, int heightMode);

}