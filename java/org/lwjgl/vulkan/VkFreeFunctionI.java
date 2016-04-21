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
 * Instances of this interface may be set to the {@code pfnFree} member of the {@link VkAllocationCallbacks} struct.
 * 
 * <p>{@code pMemory may} be {@code NULL}, which the callback <b>must</b> handle safely. If {@code pMemory} is non-{@code NULL}, it must be a pointer previously allocated by
 * {@code pfnAllocation} or {@code pfnReallocation} and must be freed by the function.</p>
 */
@FunctionalInterface
public interface VkFreeFunctionI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pp)v", true);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called by the Vulkan implementation to free memory.
	 *
	 * @param pUserData the value specified for {@link VkAllocationCallbacks}{@code .pUserData} in the allocator specified by the application
	 * @param pMemory   the allocation to be freed
	 */
	void invoke(long pUserData, long pMemory);

}