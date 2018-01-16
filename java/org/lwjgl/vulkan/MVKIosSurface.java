/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The {@code VK_MVK_ios_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@link KHRSurface VK_KHR_surface} extension) that refers to a {@code UIView}, the native surface type of iOS, which is underpinned by a {@code CAMetalLayer}, to support rendering to the surface using Apple's Metal framework.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_MVK_ios_surface}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>123</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRSurface VK_KHR_surface}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Bill Hollings @billhollings</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-02-24</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Bill Hollings, The Brenwill Workshop Ltd.</li>
 * </ul></dd>
 * </dl>
 */
public class MVKIosSurface {

    /** The extension specification version. */
    public static final int VK_MVK_IOS_SURFACE_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_MVK_IOS_SURFACE_EXTENSION_NAME = "VK_MVK_ios_surface";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_IOS_SURFACE_CREATE_INFO_MVK = 1000122000;

    protected MVKIosSurface() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesInstance caps) {
        return checkFunctions(
            caps.vkCreateIOSSurfaceMVK
        );
    }

    // --- [ vkCreateIOSSurfaceMVK ] ---

    /** Unsafe version of: {@link #vkCreateIOSSurfaceMVK CreateIOSSurfaceMVK} */
    public static int nvkCreateIOSSurfaceMVK(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateIOSSurfaceMVK;
        if (CHECKS) {
            check(__functionAddress);
            VkIOSSurfaceCreateInfoMVK.validate(pCreateInfo);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(__functionAddress, instance.address(), pCreateInfo, pAllocator, pSurface);
    }

    /**
     * Create a VkSurfaceKHR object for an iOS UIView.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a {@code VkSurfaceKHR} object for an iOS {@code UIView}, call:</p>
     * 
     * <code><pre>
     * VkResult vkCreateIOSSurfaceMVK(
     *     VkInstance                                  instance,
     *     const VkIOSSurfaceCreateInfoMVK*            pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSurfaceKHR*                               pSurface);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkIOSSurfaceCreateInfoMVK} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pSurface} <b>must</b> be a valid pointer to a {@code VkSurfaceKHR} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link KHRSurface#VK_ERROR_NATIVE_WINDOW_IN_USE_KHR ERROR_NATIVE_WINDOW_IN_USE_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkIOSSurfaceCreateInfoMVK}</p>
     *
     * @param instance    the instance with which to associate the surface.
     * @param pCreateInfo a pointer to an instance of the {@link VkIOSSurfaceCreateInfoMVK} structure containing parameters affecting the creation of the surface object.
     * @param pAllocator  the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a>).
     * @param pSurface    points to a {@code VkSurfaceKHR} handle in which the created surface object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateIOSSurfaceMVK(VkInstance instance, @NativeType("const VkIOSSurfaceCreateInfoMVK *") VkIOSSurfaceCreateInfoMVK pCreateInfo, @Nullable @NativeType("const VkAllocationCallbacks *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (CHECKS) {
            check(pSurface, 1);
        }
        return nvkCreateIOSSurfaceMVK(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSurface));
    }

    /** Array version of: {@link #vkCreateIOSSurfaceMVK CreateIOSSurfaceMVK} */
    @NativeType("VkResult")
    public static int vkCreateIOSSurfaceMVK(VkInstance instance, @NativeType("const VkIOSSurfaceCreateInfoMVK *") VkIOSSurfaceCreateInfoMVK pCreateInfo, @Nullable @NativeType("const VkAllocationCallbacks *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateIOSSurfaceMVK;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurface, 1);
            VkIOSSurfaceCreateInfoMVK.validate(pCreateInfo.address());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(__functionAddress, instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSurface);
    }

}