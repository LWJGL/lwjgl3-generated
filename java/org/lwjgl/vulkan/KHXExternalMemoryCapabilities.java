/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_KHX_external_memory_capabilities</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>72</dd>
 * <dt><b>Status</b></dt>
 * <dd>Draft</dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-10-17</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>Requires VK_KHR_get_physical_device_properties2.</li>
 * <li>Interacts with VK_NV_dedicated_allocation.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ian Elliot, Google</li>
 * <li>Jesse Hall, Google</li>
 * <li>James Jones, NVIDIA</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd>James Jones (jajones 'at' nvidia.com)</dd>
 * </dl>
 * 
 * <p>An application may wish to reference device memory in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension provides a set of capability queries and handle definitions that allow an application to determine what types of "{@code external}" memory handles an implementation supports for a given set of use cases.</p>
 */
public class KHXExternalMemoryCapabilities {

    /** The extension specification version. */
    public static final int VK_KHX_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHX_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME = "VK_KHX_external_memory_capabilities";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHX STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHX STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHX STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES_KHX STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHX STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHX}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHX = 1000071000,
        VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHX           = 1000071001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHX       = 1000071002,
        VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES_KHX                 = 1000071003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHX              = 1000071004;

    /** VK_LUID_SIZE_KHX */
    public static final int VK_LUID_SIZE_KHX = 8;

    /**
     * VkExternalMemoryHandleTypeFlagBitsKHX - Bitmask of valid external memory handle types
     * 
     * <h5>Description</h5>
     * 
     * <p>For more information, see:</p>
     * 
     * <ul>
     * <li>The reference page for {@link VkPhysicalDeviceExternalImageFormatInfoKHX}, where this interface is defined.</li>
     * <li>The See Also section for other reference pages using this type.</li>
     * <li>The Vulkan Specification.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalMemoryHandleTypeFlagsKHX}, {@link VkImportMemoryFdInfoKHX}, {@link VkImportMemoryWin32HandleInfoKHX}, {@link VkPhysicalDeviceExternalBufferInfoKHX}, {@link VkPhysicalDeviceExternalImageFormatInfoKHX}, {@link KHXExternalMemoryFd#vkGetMemoryFdKHX GetMemoryFdKHX}, {@link KHXExternalMemoryFd#vkGetMemoryFdPropertiesKHX GetMemoryFdPropertiesKHX}, {@link KHXExternalMemoryWin32#vkGetMemoryWin32HandleKHX GetMemoryWin32HandleKHX}, {@link KHXExternalMemoryWin32#vkGetMemoryWin32HandlePropertiesKHX GetMemoryWin32HandlePropertiesKHX}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHX}</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX}</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX}</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX}</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX}</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHX}</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHX}</li>
     * </ul>
     */
    public static final int
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHX         = 0x1,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX      = 0x2,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX  = 0x4,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX     = 0x8,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX = 0x10,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHX        = 0x20,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHX    = 0x40;

    /**
     * VkExternalMemoryFeatureFlagBitsKHX - Bitmask specifying features of an external memory handle type
     * 
     * <h5>Description</h5>
     * 
     * <p>These bits have the following meanings:</p>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHX EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHX} indicates that images or buffers created with the specified parameters and handle type <b>must</b> use the mechanisms defined in the {@link #VK_NV_dedicated_allocation NV_dedicated_allocation} to create (or import) a dedicated allocation for the image or buffer.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHX EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHX} indicates handles of this type <b>can</b> be exported from Vulkan memory objects.</li>
     * <li>{@link #VK_INTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHX INTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHX} indicates handles of this type <b>can</b> be imported as Vulkan memory objects.</li>
     * </ul>
     * 
     * <p>Because their semantics in external APIs roughly align with that of an image or buffer with a dedicated allocation in Vulkan, implementations are required: to report {@link #VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHX EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHX} for the following external handle types:</p>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX}</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX}</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHX}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalMemoryFeatureFlagsKHX}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHX EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHX}</li>
     * </ul>
     */
    public static final int
        VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHX = 0x1,
        VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHX     = 0x2,
        VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHX     = 0x4;

    protected KHXExternalMemoryCapabilities() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesInstance caps) {
        return checkFunctions(
            caps.vkGetPhysicalDeviceExternalBufferPropertiesKHX
        );
    }

    // --- [ vkGetPhysicalDeviceExternalBufferPropertiesKHX ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceExternalBufferPropertiesKHX GetPhysicalDeviceExternalBufferPropertiesKHX} */
    public static void nvkGetPhysicalDeviceExternalBufferPropertiesKHX(VkPhysicalDevice physicalDevice, long pExternalBufferInfo, long pExternalBufferProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalBufferPropertiesKHX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, physicalDevice.address(), pExternalBufferInfo, pExternalBufferProperties);
    }

    /**
     * (no short description available).
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the external handle types supported by buffers, call:</p>
     * 
     * <pre><code>void vkGetPhysicalDeviceExternalBufferPropertiesKHX(
    VkPhysicalDevice                            physicalDevice,
    const VkPhysicalDeviceExternalBufferInfoKHX* pExternalBufferInfo,
    VkExternalBufferPropertiesKHX*              pExternalBufferProperties);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pExternalBufferInfo} <b>must</b> be a pointer to a valid {@link VkPhysicalDeviceExternalBufferInfoKHX} structure</li>
     * <li>{@code pExternalBufferProperties} <b>must</b> be a pointer to a {@link VkExternalBufferPropertiesKHX} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkExternalBufferPropertiesKHX}, {@link VkPhysicalDeviceExternalBufferInfoKHX}</p>
     *
     * @param physicalDevice            the physical device from which to query the buffer capabilities.
     * @param pExternalBufferInfo       points to an instance of the {@link VkPhysicalDeviceExternalBufferInfoKHX} structure, describing the parameters that would be consumed by {@link VK10#vkCreateBuffer CreateBuffer}.
     * @param pExternalBufferProperties points to an instance of the {@link VkExternalBufferPropertiesKHX} structure in which capabilities are returned.
     */
    public static void vkGetPhysicalDeviceExternalBufferPropertiesKHX(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalBufferInfoKHX pExternalBufferInfo, VkExternalBufferPropertiesKHX pExternalBufferProperties) {
        nvkGetPhysicalDeviceExternalBufferPropertiesKHX(physicalDevice, pExternalBufferInfo.address(), pExternalBufferProperties.address());
    }

}