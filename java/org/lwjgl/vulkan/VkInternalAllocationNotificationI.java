/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code pfnInternalAllocation} member of the {@link VkAllocationCallbacks} struct.
 * 
 * <p>This is a purely informational callback.</p>
 */
@FunctionalInterface
public interface VkInternalAllocationNotificationI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(ppii)v", true);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called by the Vulkan implementation when an internal allocation occurs.
	 *
	 * @param pUserData       the value specified for {@link VkAllocationCallbacks}{@code .pUserData} in the allocator specified by the application
	 * @param size            the requested size of an allocation
	 * @param allocationType  the requested type of an allocation
	 * @param allocationScope a {@code VkSystemAllocationScope} value specifying the scope of the lifetime of the allocation
	 */
	void invoke(long pUserData, long size, int allocationType, int allocationScope);

}