/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;


@FunctionalInterface
public interface AIFileWriteProcI extends CallbackI.P {

    String SIGNATURE = "(pppp)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /**
     * File write procedure.
     *
     * @param pFile   File pointer to write to
     * @param pBuffer The buffer to be written
     * @param memB    Size of the individual element to be written
     * @param count   Number of elements to be written
     */
    long invoke(long pFile, long pBuffer, long memB, long count);

}