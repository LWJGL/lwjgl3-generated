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
 * Instances of this interface may be set to the {@code pfnReallocation} member of the {@link VkAllocationCallbacks} struct.
 * 
 * <p>The function must alter the size of the allocation {@code pOriginal}, either by shrinking or growing it, to accommodate the new size.</p>
 * 
 * <p>If {@code pOriginal} is {@code NULL}, then {@code pfnReallocation} <b>must</b> behave similarly to {@link VkAllocationFunction}. If size is zero, then
 * {@code pfnReallocation} must behave similarly to {@link VkFreeFunction}. The contents of the original allocation from bytes zero to
 * {@code min(original size, new size) − 1} <b>must</b> be preserved in the new allocation. If the new allocation is larger than the old allocation, then the
 * contents of the additional space are undefined. If {@code pOriginal} is non-{@code NULL}, alignment <b>must</b> be equal to the originally requested alignment. If
 * satisfying these requirements involves creating a new allocation, then the old allocation <b>must</b> be freed. If this function fails, it <b>must</b> return {@code NULL}
 * and not free the old allocation.</p>
 */
@FunctionalInterface
public interface VkReallocationFunctionI extends CallbackI.P {

	@Override
	default long address() {
		return apiCreateCallback(this, "(ppppi)p", true);
	}

	@Override
	default long callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called by the Vulkan implementation to reallocate memory.
	 *
	 * @param pUserData       the value specified for {@link VkAllocationCallbacks}{@code .pUserData} in the allocator specified by the application
	 * @param pOriginal       <b>must</b> be either {@code NULL} or a pointer previously returned by {@code pfnReallocation} or {@code pfnAllocation} of the same allocator
	 * @param size            the size in bytes of the requested allocation
	 * @param alignment       the requested alignment of the allocation in bytes and <b>must</b> be a power of two
	 * @param allocationScope a {@code VkSystemAllocationScope} value specifying the scope of the lifetime of the allocation
	 */
	long invoke(long pUserData, long pOriginal, long size, long alignment, int allocationScope);

}