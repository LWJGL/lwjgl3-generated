/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Application-defined memory free notification function.
 * 
 * <h5>C Specification</h5>
 * 
 * <p>The type of {@code pfnInternalFree} is:</p>
 * 
 * <code><pre>
 * typedef void (VKAPI_PTR *PFN_vkInternalFreeNotification)(
 *     void*                                       pUserData,
 *     size_t                                      size,
 *     VkInternalAllocationType                    allocationType,
 *     VkSystemAllocationScope                     allocationScope);</pre></code>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAllocationCallbacks}</p>
 */
public abstract class VkInternalFreeNotification extends Callback implements VkInternalFreeNotificationI {

    /** Creates a {@code VkInternalFreeNotification} instance from the specified function pointer. */
    public static VkInternalFreeNotification create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        VkInternalFreeNotificationI instance = Callback.get(functionPointer);
        return instance instanceof VkInternalFreeNotification
            ? (VkInternalFreeNotification)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code VkInternalFreeNotification} instance that delegates to the specified {@code VkInternalFreeNotificationI} instance. */
    public static VkInternalFreeNotification create(VkInternalFreeNotificationI instance) {
        return instance instanceof VkInternalFreeNotification
            ? (VkInternalFreeNotification)instance
            : new Container(instance.address(), instance);
    }

    protected VkInternalFreeNotification() {
        super(SIGNATURE);
    }

    private VkInternalFreeNotification(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends VkInternalFreeNotification {

        private final VkInternalFreeNotificationI delegate;

        Container(long functionPointer, VkInternalFreeNotificationI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long pUserData, long size, int allocationType, int allocationScope) {
            delegate.invoke(pUserData, size, allocationType, allocationScope);
        }

    }

}