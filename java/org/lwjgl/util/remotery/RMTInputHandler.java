/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class RMTInputHandler extends Callback implements RMTInputHandlerI {

    /** Creates a {@code RMTInputHandler} instance from the specified function pointer. */
    public static RMTInputHandler create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        RMTInputHandlerI instance = Callback.get(functionPointer);
        return instance instanceof RMTInputHandler
            ? (RMTInputHandler)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code RMTInputHandler} instance that delegates to the specified {@code RMTInputHandlerI} instance. */
    public static RMTInputHandler create(RMTInputHandlerI instance) {
        return instance instanceof RMTInputHandler
            ? (RMTInputHandler)instance
            : new Container(instance.address(), instance);
    }

    protected RMTInputHandler() {
        super(SIGNATURE);
    }

    private RMTInputHandler(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RMTInputHandler {

        private final RMTInputHandlerI delegate;

        Container(long functionPointer, RMTInputHandlerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long text, long context) {
            return delegate.invoke(text, context);
        }

    }

}