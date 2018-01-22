/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * An application may wish to reference device memory in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension provides a set of capability queries and handle definitions that allow an application to determine what types of "{@code external}" memory handles an implementation supports for a given set of use cases.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_external_memory_capabilities}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>72</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones @cubanismo</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-10-17</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}.</li>
 * <li>Interacts with {@link KHRDedicatedAllocation VK_KHR_dedicated_allocation}.</li>
 * <li>Interacts with {@link NVDedicatedAllocation VK_NV_dedicated_allocation}.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ian Elliot, Google</li>
 * <li>Jesse Hall, Google</li>
 * <li>James Jones, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class KHRExternalMemoryCapabilities {

    /** The extension specification version. */
    public static final int VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_memory_capabilities";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHR STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES_KHR STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHR = 1000071000,
        VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHR           = 1000071001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHR       = 1000071002,
        VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES_KHR                 = 1000071003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR              = 1000071004;

    /** VK_LUID_SIZE_KHR */
    public static final int VK_LUID_SIZE_KHR = 8;

    /**
     * VkExternalMemoryHandleTypeFlagBitsKHR - Bit specifying external memory handle types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR} specifies a POSIX file descriptor handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the POSIX system calls ftext:dup, ftext:dup2, ftext:close, and the non-standard system call ftext:dup3. Additionally, it <b>must</b> be transportable over a socket using an {@code SCM_RIGHTS} control message. It owns a reference to the underlying memory resource represented by its Vulkan memory object.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR} specifies an NT handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the functions ftext:DuplicateHandle, ftext:CloseHandle, ftext:CompareObjectHandles, ftext:GetHandleInformation, and ftext:SetHandleInformation. It owns a reference to the underlying memory resource represented by its Vulkan memory object.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR} specifies a global share handle that has only limited valid usage outside of Vulkan and other compatible APIs. It is not compatible with any native APIs. It does not own a reference to the underlying memory resource represented its Vulkan memory object, and will therefore become invalid when all Vulkan memory objects associated with it are destroyed.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR} specifies an NT handle returned by {@code IDXGIResource1}::{@code CreateSharedHandle} referring to a Direct3D 10 or 11 texture resource. It owns a reference to the memory used by the Direct3D resource.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR} specifies a global share handle returned by {@code IDXGIResource}::{@code GetSharedHandle} referring to a Direct3D 10 or 11 texture resource. It does not own a reference to the underlying Direct3D resource, and will therefore become invalid when all Vulkan memory objects and Direct3D resources associated with it are destroyed.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR} specifies an NT handle returned by {@code ID3D12Device}::{@code CreateSharedHandle} referring to a Direct3D 12 heap resource. It owns a reference to the resources used by the Direct3D heap.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR} specifies an NT handle returned by {@code ID3D12Device}::{@code CreateSharedHandle} referring to a Direct3D 12 committed resource. It owns a reference to the memory used by the Direct3D resource.</li>
     * <li>{@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT} specifies a host pointer returned by a host memory allocation command. It does not own a reference to the underlying memory resource, and will therefore become invalid if the host memory is freed.</li>
     * <li>{@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT} specifies a host pointer to <em>host mapped foreign memory</em>. It does not own a reference to the underlying memory resource, and will therefore become invalid if the foreign memory is unmapped or otherwise becomes no longer available.</li>
     * <li>{@link EXTExternalMemoryDmaBuf#VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT} is a file descriptor for a Linux dma_buf. It owns a reference to the underlying memory resource represented by its Vulkan memory object.</li>
     * </ul>
     * 
     * <p>Some external memory handle types can only be shared within the same underlying physical device and/or the same driver version, as defined in the following table:</p>
     * 
     * <h6>External memory handle types compatibility</h6>
     * 
     * <table class="lwjgl">
     * <tbody>
     * <tr><td>Handle type</td><td>{@link VkPhysicalDeviceIDPropertiesKHR}{@code ::driverUUID}</td><td>{@link VkPhysicalDeviceIDPropertiesKHR}{@code ::deviceUUID}</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT}</td><td>No restriction</td><td>No restriction</td></tr>
     * <tr><td>{@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT}</td><td>No restriction</td><td>No restriction</td></tr>
     * <tr><td>{@link EXTExternalMemoryDmaBuf#VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT}</td><td>No restriction</td><td>No restriction</td></tr>
     * </tbody>
     * </table>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The above table does not restrict the drivers and devices with which {@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT} and {@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT} <b>may</b> be shared, as these handle types inherently mean memory that does not come from the same device, as they import memory from the host or a foreign device, respectively.</p>
     * </div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Even though the above table does not restrict the drivers and devices with which {@link EXTExternalMemoryDmaBuf#VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT} <b>may</b> be shared, query mechanisms exist in the Vulkan API that prevent the import of incompatible dma-bufs (such as {@link KHRExternalMemoryFd#vkGetMemoryFdPropertiesKHR GetMemoryFdPropertiesKHR}) and that prevent incompatible usage of dma-bufs (such as {@link VkPhysicalDeviceExternalBufferInfoKHR} and {@link VkPhysicalDeviceExternalImageFormatInfoKHR}).</p>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalMemoryHandleTypeFlagsKHR}, {@link VkImportMemoryFdInfoKHR}, {@link VkImportMemoryHostPointerInfoEXT}, {@link VkImportMemoryWin32HandleInfoKHR}, {@link VkMemoryGetFdInfoKHR}, {@link VkMemoryGetWin32HandleInfoKHR}, {@link VkPhysicalDeviceExternalBufferInfoKHR}, {@link VkPhysicalDeviceExternalImageFormatInfoKHR}, {@link KHRExternalMemoryFd#vkGetMemoryFdPropertiesKHR GetMemoryFdPropertiesKHR}, {@link EXTExternalMemoryHost#vkGetMemoryHostPointerPropertiesEXT GetMemoryHostPointerPropertiesEXT}, {@link KHRExternalMemoryWin32#vkGetMemoryWin32HandlePropertiesKHR GetMemoryWin32HandlePropertiesKHR}</p>
     */
    public static final int
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR         = 0x1,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR      = 0x2,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR  = 0x4,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR     = 0x8,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR = 0x10,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR        = 0x20,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR    = 0x40;

    /**
     * VkExternalMemoryFeatureFlagBitsKHR - Bitmask specifying features of an external memory handle type
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR} specifies that images or buffers created with the specified parameters and handle type <b>must</b> use the mechanisms defined in the {@link NVDedicatedAllocation VK_NV_dedicated_allocation} extension to create (or import) a dedicated allocation for the image or buffer.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHR EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHR} specifies that handles of this type <b>can</b> be exported from Vulkan memory objects.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHR EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHR} specifies that handles of this type <b>can</b> be imported as Vulkan memory objects.</li>
     * </ul>
     * 
     * <p>Because their semantics in external APIs roughly align with that of an image or buffer with a dedicated allocation in Vulkan, implementations are required: to report {@link #VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR} for the following external handle types:</p>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR}</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR}</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalMemoryFeatureFlagsKHR}</p>
     */
    public static final int
        VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR = 0x1,
        VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHR     = 0x2,
        VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHR     = 0x4;

    protected KHRExternalMemoryCapabilities() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesInstance caps) {
        return checkFunctions(
            caps.vkGetPhysicalDeviceExternalBufferPropertiesKHR
        );
    }

    // --- [ vkGetPhysicalDeviceExternalBufferPropertiesKHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceExternalBufferPropertiesKHR GetPhysicalDeviceExternalBufferPropertiesKHR} */
    public static void nvkGetPhysicalDeviceExternalBufferPropertiesKHR(VkPhysicalDevice physicalDevice, long pExternalBufferInfo, long pExternalBufferProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalBufferPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, physicalDevice.address(), pExternalBufferInfo, pExternalBufferProperties);
    }

    /**
     * Query external handle types supported by buffers.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the external handle types supported by buffers, call:</p>
     * 
     * <code><pre>
     * void vkGetPhysicalDeviceExternalBufferPropertiesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceExternalBufferInfoKHR* pExternalBufferInfo,
     *     VkExternalBufferPropertiesKHR*              pExternalBufferProperties);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pExternalBufferInfo} <b>must</b> be a valid pointer to a valid {@link VkPhysicalDeviceExternalBufferInfoKHR} structure</li>
     * <li>{@code pExternalBufferProperties} <b>must</b> be a valid pointer to a {@link VkExternalBufferPropertiesKHR} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkExternalBufferPropertiesKHR}, {@link VkPhysicalDeviceExternalBufferInfoKHR}</p>
     *
     * @param physicalDevice            the physical device from which to query the buffer capabilities.
     * @param pExternalBufferInfo       points to an instance of the {@link VkPhysicalDeviceExternalBufferInfoKHR} structure, describing the parameters that would be consumed by {@link VK10#vkCreateBuffer CreateBuffer}.
     * @param pExternalBufferProperties points to an instance of the {@link VkExternalBufferPropertiesKHR} structure in which capabilities are returned.
     */
    public static void vkGetPhysicalDeviceExternalBufferPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("const VkPhysicalDeviceExternalBufferInfoKHR *") VkPhysicalDeviceExternalBufferInfoKHR pExternalBufferInfo, @NativeType("VkExternalBufferPropertiesKHR *") VkExternalBufferPropertiesKHR pExternalBufferProperties) {
        nvkGetPhysicalDeviceExternalBufferPropertiesKHR(physicalDevice, pExternalBufferInfo.address(), pExternalBufferProperties.address());
    }

}