/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;


@FunctionalInterface
public interface AIFileOpenProcI extends CallbackI.P {

    String SIGNATURE = "(ppp)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /**
     * File open procedure
     *
     * @param pFileIO  FileIO system pointer
     * @param fileName The name of the file to be opened
     * @param openMode The mode in which to open the file
     */
    long invoke(long pFileIO, long fileName, long openMode);

}