/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * <h3>Type</h3>
 * 
 * <code><pre>
 * int (*) (
 *     const YGConfigRef config,
 *     const YGNodeRef node,
 *     YGLogLevel level,
 *     const char *format,
 *     va_list *args
 * )</pre></code>
 */
@FunctionalInterface
@NativeType("YGLogger")
public interface YGLoggerI extends CallbackI.I {

    String SIGNATURE = "(ppipp)i";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default int callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    int invoke(@NativeType("const YGConfigRef") long config, @NativeType("const YGNodeRef") long node, @NativeType("YGLogLevel") int level, @NativeType("const char *") long format, @NativeType("va_list *") long args);

}