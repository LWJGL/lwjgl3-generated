/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Application-defined memory reallocation function.
 * 
 * <h5>C Specification</h5>
 * 
 * <p>The type of {@code pfnReallocation} is:</p>
 * 
 * <pre><code>typedef void* (VKAPI_PTR *PFN_vkReallocationFunction)(
    void*                                       pUserData,
    void*                                       pOriginal,
    size_t                                      size,
    size_t                                      alignment,
    VkSystemAllocationScope                     allocationScope);</code></pre>
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code pfnReallocation} <b>must</b> return an allocation with enough space for {@code size} bytes, and the contents of the original allocation from bytes zero to <code>min(original size, new size) - 1</code> <b>must</b> be preserved in the returned allocation. If {@code size} is larger than the old size, the contents of the additional space are undefined. If satisfying these requirements involves creating a new allocation, then the old allocation <b>should</b> be freed.</p>
 * 
 * <p>If {@code pOriginal} is {@code NULL}, then {@code pfnReallocation} <b>must</b> behave equivalently to a call to {@link VkAllocationFunction} with the same parameter values (without {@code pOriginal}).</p>
 * 
 * <p>If {@code size} is zero, then {@code pfnReallocation} <b>must</b> behave equivalently to a call to {@link VkFreeFunction} with the same {@code pUserData} parameter value, and {@code pMemory} equal to {@code pOriginal}.</p>
 * 
 * <p>If {@code pOriginal} is non-{@code NULL}, the implementation <b>must</b> ensure that {@code alignment} is equal to the {@code alignment} used to originally allocate {@code pOriginal}.</p>
 * 
 * <p>If this function fails and {@code pOriginal} is non-{@code NULL} the application <b>must</b> not free the old allocation.</p>
 * 
 * <p>{@code pfnReallocation} <b>must</b> follow the same <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#vkAllocationFunction_return_rules"> rules for return values as tname:PFN_vkAllocationFunction</a>.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAllocationCallbacks}</p>
 */
@FunctionalInterface
public interface VkReallocationFunctionI extends CallbackI.P {

	String SIGNATURE = Callback.__stdcall("(ppppi)p");

	@Override
	default String getSignature() { return SIGNATURE; }

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
	 * Application-defined memory reallocation function.
	 *
	 * @param pUserData       the value specified for {@link VkAllocationCallbacks}{@code ::pUserData} in the allocator specified by the application.
	 * @param pOriginal       <b>must</b> be either {@code NULL} or a pointer previously returned by {@code pfnReallocation} or {@code pfnAllocation} of the same allocator.
	 * @param size            the size in bytes of the requested allocation.
	 * @param alignment       the requested alignment of the allocation in bytes and <b>must</b> be a power of two.
	 * @param allocationScope a {@code VkSystemAllocationScope} value specifying the allocation scope of the lifetime of the allocation, as described <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-host-allocation-scope">here</a>.
	 */
	long invoke(long pUserData, long pOriginal, long size, long alignment, int allocationScope);

}