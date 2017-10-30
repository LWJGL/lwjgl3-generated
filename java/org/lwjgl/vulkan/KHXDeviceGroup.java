/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension provides functionality to use a logical device that consists of multiple physical devices, as created with the {@code VK_KHX_device_group_creation} extension. A device group can allocate memory across the subdevices, bind memory from one subdevice to a resource on another subdevice, record command buffers where some work executes on an arbitrary subset of the subdevices, and potentially present a swapchain image from one or more subdevices.
 * 
 * <h5>Examples</h5>
 * 
 * <p>TODO</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHX_device_group}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>61</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VK_KHX_device_group_creation">{@code VK_KHX_device_group_creation}</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz @jbolz</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-05-19</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Tobias Hector, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public class KHXDeviceGroup {

    /** The extension specification version. */
    public static final int VK_KHX_DEVICE_GROUP_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_KHX_DEVICE_GROUP_EXTENSION_NAME = "VK_KHX_device_group";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHX STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHX STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHX STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHX STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHX STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHX STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHX}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHX             = 1000060000,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHX    = 1000060003,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHX = 1000060004,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHX               = 1000060005,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHX          = 1000060006,
        VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHX                = 1000060010;

    /**
     * Extends {@code VkPipelineCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHX PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHX}</li>
     * <li>{@link #VK_PIPELINE_CREATE_DISPATCH_BASE_KHX PIPELINE_CREATE_DISPATCH_BASE_KHX}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHX = 0x8,
        VK_PIPELINE_CREATE_DISPATCH_BASE_KHX                    = 0x10;

    /** Extends {@code VkDependencyFlagBits}. */
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT_KHX = 0x4;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHX STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHX STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHX}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHX = 1000060013,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHX  = 1000060014;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_BIND_SFR_BIT_KHX = 0x40;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHX = 1000060007;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHX STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHX STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHX STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHX STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHX}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHX        = 1000060008,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHX   = 1000060009,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHX          = 1000060011,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHX = 1000060012;

    /** Extends {@code VkSwapchainCreateFlagBitsKHR}. */
    public static final int VK_SWAPCHAIN_CREATE_BIND_SFR_BIT_KHX = 0x1;

    /**
     * VkPeerMemoryFeatureFlagBitsKHX - Bitmask specifying supported peer memory features
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHX PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHX} indicates that the memory <b>can</b> be accessed as the source of a ftext:vkCmdCopyBuffer, ftext:vkCmdCopyImage, ftext:vkCmdCopyBufferToImage, or ftext:vkCmdCopyImageToBuffer command.</li>
     * <li>{@link #VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHX PEER_MEMORY_FEATURE_COPY_DST_BIT_KHX} indicates that the memory <b>can</b> be accessed as the destination of a ftext:vkCmdCopyBuffer, ftext:vkCmdCopyImage, ftext:vkCmdCopyBufferToImage, or ftext:vkCmdCopyImageToBuffer command.</li>
     * <li>{@link #VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHX PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHX} indicates that the memory <b>can</b> be read as any memory access type.</li>
     * <li>{@link #VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHX PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHX} indicates that the memory <b>can</b> be written as any memory access type. Shader atomics are considered to be writes.</li>
     * </ul>
     * 
     * <p>{@link #VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHX PEER_MEMORY_FEATURE_COPY_DST_BIT_KHX} <b>must</b> be supported for all host local heaps and for at least one device local heap.</p>
     * 
     * <p>If a device does not support a peer memory feature, it is still valid to use a resource that includes both local and peer memory bindings with the corresponding access type as long as only the local bindings are actually accessed. For example, an application doing split-frame rendering would use framebuffer attachments that include both local and peer memory bindings, but would scissor the rendering to only update local memory.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkPeerMemoryFeatureFlagsKHX}</p>
     */
    public static final int
        VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHX    = 0x1,
        VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHX    = 0x2,
        VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHX = 0x4,
        VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHX = 0x8;

    /**
     * VkMemoryAllocateFlagBitsKHX - Bitmask specifying flags for a device memory allocation
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX} specifies that memory will be allocated for the devices in {@link VkMemoryAllocateFlagsInfoKHX}{@code ::deviceMask}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkMemoryAllocateFlagsKHX}</p>
     */
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHX = 0x1;

    /**
     * VkDeviceGroupPresentModeFlagBitsKHX - Bitmask specifying supported device group present modes
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX} indicates that any physical device with a presentation engine <b>can</b> present its own swapchain images.</li>
     * <li>{@link #VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHX DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHX} indicates that any physical device with a presentation engine <b>can</b> present swapchain images from any physical device in its {@code presentMask}.</li>
     * <li>{@link #VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHX DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHX} indicates that any physical device with a presentation engine <b>can</b> present the sum of swapchain images from any physical devices in its {@code presentMask}.</li>
     * <li>{@link #VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX} indicates that multiple physical devices with a presentation engine <b>can</b> each present their own swapchain images.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceGroupPresentInfoKHX}, {@code VkDeviceGroupPresentModeFlagsKHX}</p>
     */
    public static final int
        VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX              = 0x1,
        VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHX             = 0x2,
        VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHX                = 0x4,
        VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX = 0x8;

    protected KHXDeviceGroup() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesInstance caps, java.util.Set<String> ext) {
        return checkFunctions(
            ext.contains("VK_KHR_surface") ? caps.vkGetPhysicalDevicePresentRectanglesKHX : -1L
        );
    }

    static boolean isAvailable(VKCapabilitiesInstance capsInstance, VKCapabilitiesDevice caps, java.util.Set<String> ext) {
        return isAvailable(capsInstance, ext) && checkFunctions(
            caps.vkGetDeviceGroupPeerMemoryFeaturesKHX, caps.vkCmdSetDeviceMaskKHX, caps.vkCmdDispatchBaseKHX, 
            ext.contains("VK_KHR_surface") ? caps.vkGetDeviceGroupPresentCapabilitiesKHX : -1L, 
            ext.contains("VK_KHR_surface") ? caps.vkGetDeviceGroupSurfacePresentModesKHX : -1L, 
            ext.contains("VK_KHR_swapchain") ? caps.vkAcquireNextImage2KHX : -1L
        );
    }

    // --- [ vkGetDeviceGroupPeerMemoryFeaturesKHX ] ---

    /** Unsafe version of: {@link #vkGetDeviceGroupPeerMemoryFeaturesKHX GetDeviceGroupPeerMemoryFeaturesKHX} */
    public static void nvkGetDeviceGroupPeerMemoryFeaturesKHX(VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, long pPeerMemoryFeatures) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPeerMemoryFeaturesKHX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, device.address(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures);
    }

    /**
     * Query supported peer memory features of a device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p><em>Peer memory</em> is memory that is allocated for a given physical device and then bound to a resource and accessed by a different physical device, in a logical device that represents multiple physical devices. Some ways of reading and writing peer memory <b>may</b> not be supported by a device.</p>
     * 
     * <p>To determine how peer memory <b>can</b> be accessed, call:</p>
     * 
     * <code><pre>
     * void vkGetDeviceGroupPeerMemoryFeaturesKHX(
     *     VkDevice                                    device,
     *     uint32_t                                    heapIndex,
     *     uint32_t                                    localDeviceIndex,
     *     uint32_t                                    remoteDeviceIndex,
     *     VkPeerMemoryFeatureFlagsKHX*                pPeerMemoryFeatures);</pre></code>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code heapIndex} <b>must</b> be less than {@code memoryHeapCount}</li>
     * <li>{@code localDeviceIndex} <b>must</b> be a valid device index</li>
     * <li>{@code remoteDeviceIndex} <b>must</b> be a valid device index</li>
     * <li>{@code localDeviceIndex} <b>must</b> not equal remoteDeviceIndex</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pPeerMemoryFeatures} <b>must</b> be a valid pointer to a {@code VkPeerMemoryFeatureFlagsKHX} value</li>
     * </ul>
     *
     * @param device              the logical device that owns the memory.
     * @param heapIndex           the index of the memory heap from which the memory is allocated.
     * @param localDeviceIndex    the device index of the physical device that performs the memory access.
     * @param remoteDeviceIndex   the device index of the physical device that the memory is allocated for.
     * @param pPeerMemoryFeatures a pointer to a bitmask of {@code VkPeerMemoryFeatureFlagBitsKHX} indicating which types of memory accesses are supported for the combination of heap, local, and remote devices.
     */
    public static void vkGetDeviceGroupPeerMemoryFeaturesKHX(VkDevice device, @NativeType("uint32_t") int heapIndex, @NativeType("uint32_t") int localDeviceIndex, @NativeType("uint32_t") int remoteDeviceIndex, @NativeType("VkPeerMemoryFeatureFlagsKHX *") IntBuffer pPeerMemoryFeatures) {
        if (CHECKS) {
            check(pPeerMemoryFeatures, 1);
        }
        nvkGetDeviceGroupPeerMemoryFeaturesKHX(device, heapIndex, localDeviceIndex, remoteDeviceIndex, memAddress(pPeerMemoryFeatures));
    }

    // --- [ vkCmdSetDeviceMaskKHX ] ---

    /**
     * Modify device mask of a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To update the current device mask of a command buffer, call:</p>
     * 
     * <code><pre>
     * void vkCmdSetDeviceMaskKHX(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    deviceMask);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code deviceMask} is used to filter out subsequent commands from executing on all physical devices whose bit indices are not set in the mask.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code deviceMask} <b>must</b> be a valid device mask value</li>
     * <li>{@code deviceMask} <b>must</b> not be zero</li>
     * <li>{@code deviceMask} <b>must</b> not include any set bits that were not in the {@link VkDeviceGroupCommandBufferBeginInfoKHX}{@code ::deviceMask} value when the command buffer began recording.</li>
     * <li>If {@link #vkCmdSetDeviceMaskKHX CmdSetDeviceMaskKHX} is called inside a render pass instance, {@code deviceMask} <b>must</b> not include any set bits that were not in the {@link VkDeviceGroupRenderPassBeginInfoKHX}{@code ::deviceMask} value when the render pass instance began recording.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, compute, or transfer operations</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics compute transfer</td><td></td></tr></tbody>
     * </table>
     *
     * @param commandBuffer command buffer whose current device mask is modified.
     * @param deviceMask    the new value of the current device mask.
     */
    public static void vkCmdSetDeviceMaskKHX(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int deviceMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDeviceMaskKHX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, commandBuffer.address(), deviceMask);
    }

    // --- [ vkCmdDispatchBaseKHX ] ---

    /**
     * Dispatch compute work items.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record a dispatch using non-zero base values for the components of {@code WorkgroupId}, call:</p>
     * 
     * <code><pre>
     * void vkCmdDispatchBaseKHX(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    baseGroupX,
     *     uint32_t                                    baseGroupY,
     *     uint32_t                                    baseGroupZ,
     *     uint32_t                                    groupCountX,
     *     uint32_t                                    groupCountY,
     *     uint32_t                                    groupCountZ);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>When the command is executed, a global workgroup consisting of <code>groupCountX × groupCountY × groupCountZ</code> local workgroups is assembled, with {@code WorkgroupId} values ranging from <code>[baseGroup, baseGroup + groupCount)</code> in each component. {@link VK10#vkCmdDispatch CmdDispatch} is equivalent to vkCmdDispatchBaseKHX(0,0,0,groupCountX,groupCountY,groupCountZ).</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All valid usage rules from {@link VK10#vkCmdDispatch CmdDispatch} apply</li>
     * <li>{@code baseGroupX} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[0]</li>
     * <li>{@code baseGroupX} <b>must</b> be less than {@code VkPhysicaYDeviceLimits}{@code ::maxComputeWorkGroupCount}[1]</li>
     * <li>{@code baseGroupZ} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[2]</li>
     * <li>{@code groupCountX} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[0] minus {@code baseGroupX}</li>
     * <li>{@code groupCountY} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[1] minus {@code baseGroupY}</li>
     * <li>{@code groupCountZ} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[2] minus {@code baseGroupZ}</li>
     * <li>If any of {@code baseGroupX}, {@code baseGroupY}, or {@code baseGroupZ} are not zero, then the currently bound compute pipeline <b>must</b> have been created with the {@link #VK_PIPELINE_CREATE_DISPATCH_BASE_KHX PIPELINE_CREATE_DISPATCH_BASE_KHX} flag.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td><td></td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param baseGroupX    the start value for the X component of {@code WorkgroupId}.
     * @param baseGroupY    the start value for the Y component of {@code WorkgroupId}.
     * @param baseGroupZ    the start value for the Z component of {@code WorkgroupId}.
     * @param groupCountX   the number of local workgroups to dispatch in the X dimension.
     * @param groupCountY   the number of local workgroups to dispatch in the Y dimension.
     * @param groupCountZ   the number of local workgroups to dispatch in the Z dimension.
     */
    public static void vkCmdDispatchBaseKHX(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int baseGroupX, @NativeType("uint32_t") int baseGroupY, @NativeType("uint32_t") int baseGroupZ, @NativeType("uint32_t") int groupCountX, @NativeType("uint32_t") int groupCountY, @NativeType("uint32_t") int groupCountZ) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchBaseKHX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, commandBuffer.address(), baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ);
    }

    // --- [ vkGetDeviceGroupPresentCapabilitiesKHX ] ---

    /** Unsafe version of: {@link #vkGetDeviceGroupPresentCapabilitiesKHX GetDeviceGroupPresentCapabilitiesKHX} */
    public static int nvkGetDeviceGroupPresentCapabilitiesKHX(VkDevice device, long pDeviceGroupPresentCapabilities) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPresentCapabilitiesKHX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, device.address(), pDeviceGroupPresentCapabilities);
    }

    /**
     * Query present capabilities from other physical devices.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>A logical device that represents multiple physical devices <b>may</b> support presenting from images on more than one physical device, or combining images from multiple physical devices.</p>
     * 
     * <p>To query these capabilities, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetDeviceGroupPresentCapabilitiesKHX(
     *     VkDevice                                    device,
     *     VkDeviceGroupPresentCapabilitiesKHX*        pDeviceGroupPresentCapabilities);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pDeviceGroupPresentCapabilities} <b>must</b> be a valid pointer to a {@link VkDeviceGroupPresentCapabilitiesKHX} structure</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceGroupPresentCapabilitiesKHX}</p>
     *
     * @param device                          the logical device.
     * @param pDeviceGroupPresentCapabilities a pointer to a structure of type {@link VkDeviceGroupPresentCapabilitiesKHX} that is filled with the logical device&#8217;s capabilities.
     */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupPresentCapabilitiesKHX(VkDevice device, @NativeType("VkDeviceGroupPresentCapabilitiesKHX *") VkDeviceGroupPresentCapabilitiesKHX pDeviceGroupPresentCapabilities) {
        return nvkGetDeviceGroupPresentCapabilitiesKHX(device, pDeviceGroupPresentCapabilities.address());
    }

    // --- [ vkGetDeviceGroupSurfacePresentModesKHX ] ---

    /** Unsafe version of: {@link #vkGetDeviceGroupSurfacePresentModesKHX GetDeviceGroupSurfacePresentModesKHX} */
    public static int nvkGetDeviceGroupSurfacePresentModesKHX(VkDevice device, long surface, long pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModesKHX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(__functionAddress, device.address(), surface, pModes);
    }

    /**
     * Query present capabilities for a surface.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Some surfaces <b>may</b> not be capable of using all the device group present modes.</p>
     * 
     * <p>To query the supported device group present modes for a particular surface, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetDeviceGroupSurfacePresentModesKHX(
     *     VkDevice                                    device,
     *     VkSurfaceKHR                                surface,
     *     VkDeviceGroupPresentModeFlagsKHX*           pModes);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>The modes returned by this command are not invariant, and <b>may</b> change in response to the surface being moved, resized, or occluded. These modes <b>must</b> be a subset of the modes returned by {@link #vkGetDeviceGroupPresentCapabilitiesKHX GetDeviceGroupPresentCapabilitiesKHX}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
     * <li>{@code pModes} <b>must</b> be a valid pointer to a {@code VkDeviceGroupPresentModeFlagsKHX} value</li>
     * <li>Both of {@code device}, and {@code surface} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code surface} <b>must</b> be externally synchronized</li>
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
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device  the logical device.
     * @param surface the surface.
     * @param pModes  a pointer to a value of type {@code VkDeviceGroupPresentModeFlagsKHX} that is filled with the supported device group present modes for the surface.
     */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModesKHX(VkDevice device, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkDeviceGroupPresentModeFlagsKHX *") IntBuffer pModes) {
        if (CHECKS) {
            check(pModes, 1);
        }
        return nvkGetDeviceGroupSurfacePresentModesKHX(device, surface, memAddress(pModes));
    }

    // --- [ vkGetPhysicalDevicePresentRectanglesKHX ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDevicePresentRectanglesKHX GetPhysicalDevicePresentRectanglesKHX}
     *
     * @param pRectCount a pointer to an integer related to the number of rectangles available or queried, as described below.
     */
    public static int nvkGetPhysicalDevicePresentRectanglesKHX(VkPhysicalDevice physicalDevice, long surface, long pRectCount, long pRects) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDevicePresentRectanglesKHX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(__functionAddress, physicalDevice.address(), surface, pRectCount, pRects);
    }

    /**
     * Query present rectangles for a surface on a physical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>When using {@link #VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX}, the application <b>may</b> need to know which regions of the surface are used when presenting locally on each physical device. Presentation of swapchain images to this surface need only have valid contents in the regions returned by this command.</p>
     * 
     * <p>To query a set of rectangles used in presentation on the physical device, call:</p>
     * 
     * <code><pre>
     * VkResult vkGetPhysicalDevicePresentRectanglesKHX(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkSurfaceKHR                                surface,
     *     uint32_t*                                   pRectCount,
     *     VkRect2D*                                   pRects);</pre></code>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pRects} is {@code NULL}, then the number of rectangles used when presenting the given {@code surface} is returned in {@code pRectCount}. Otherwise, {@code pRectCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pRects} array, and on return the variable is overwritten with the number of structures actually written to {@code pRects}. If the value of {@code pRectCount} is less than the number of rectangles, at most {@code pRectCount} structures will be written. If {@code pRectCount} is smaller than the number of rectangles used for the given {@code surface}, {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS} to indicate that not all the available values were returned.</p>
     * 
     * <p>The values returned by this command are not invariant, and <b>may</b> change in response to the surface being moved, resized, or occluded.</p>
     * 
     * <p>The rectangles returned by this command <b>must</b> not overlap.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
     * <li>{@code pRectCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pRectCount} is not 0, and {@code pRects} is not {@code NULL}, {@code pRects} <b>must</b> be a valid pointer to an array of {@code pRectCount} {@link VkRect2D} structures</li>
     * <li>Both of {@code physicalDevice}, and {@code surface} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code surface} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRect2D}</p>
     *
     * @param physicalDevice the physical device.
     * @param surface        the surface.
     * @param pRectCount     a pointer to an integer related to the number of rectangles available or queried, as described below.
     * @param pRects         either {@code NULL} or a pointer to an array of {@link VkRect2D} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDevicePresentRectanglesKHX(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") IntBuffer pRectCount, @NativeType("VkRect2D *") VkRect2D.Buffer pRects) {
        if (CHECKS) {
            check(pRectCount, 1);
            checkSafe(pRects, pRectCount.get(pRectCount.position()));
        }
        return nvkGetPhysicalDevicePresentRectanglesKHX(physicalDevice, surface, memAddress(pRectCount), memAddressSafe(pRects));
    }

    // --- [ vkAcquireNextImage2KHX ] ---

    /** Unsafe version of: {@link #vkAcquireNextImage2KHX AcquireNextImage2KHX} */
    public static int nvkAcquireNextImage2KHX(VkDevice device, long pAcquireInfo, long pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImage2KHX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, device.address(), pAcquireInfo, pImageIndex);
    }

    /**
     * Retrieve the index of the next available presentable image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To acquire an available presentable image to use, and retrieve the index of that image, call:</p>
     * 
     * <code><pre>
     * VkResult vkAcquireNextImage2KHX(
     *     VkDevice                                    device,
     *     const VkAcquireNextImageInfoKHX*            pAcquireInfo,
     *     uint32_t*                                   pImageIndex);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pAcquireInfo} <b>must</b> be a valid pointer to a valid {@link VkAcquireNextImageInfoKHX} structure</li>
     * <li>{@code pImageIndex} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_TIMEOUT TIMEOUT}</li>
     * <li>{@link VK10#VK_NOT_READY NOT_READY}</li>
     * <li>{@link KHRSwapchain#VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * <li>{@link KHRSwapchain#VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}</li>
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAcquireNextImageInfoKHX}</p>
     *
     * @param device       the device associated with {@code swapchain}.
     * @param pAcquireInfo a pointer to a structure of type {@link VkAcquireNextImageInfoKHX} containing parameters of the acquire.
     * @param pImageIndex  a pointer to a {@code uint32_t} that is set to the index of the next image to use.
     */
    @NativeType("VkResult")
    public static int vkAcquireNextImage2KHX(VkDevice device, @NativeType("const VkAcquireNextImageInfoKHX *") VkAcquireNextImageInfoKHX pAcquireInfo, @NativeType("uint32_t *") IntBuffer pImageIndex) {
        if (CHECKS) {
            check(pImageIndex, 1);
        }
        return nvkAcquireNextImage2KHX(device, pAcquireInfo.address(), memAddress(pImageIndex));
    }

    /** Array version of: {@link #vkGetDeviceGroupPeerMemoryFeaturesKHX GetDeviceGroupPeerMemoryFeaturesKHX} */
    public static void vkGetDeviceGroupPeerMemoryFeaturesKHX(VkDevice device, @NativeType("uint32_t") int heapIndex, @NativeType("uint32_t") int localDeviceIndex, @NativeType("uint32_t") int remoteDeviceIndex, @NativeType("VkPeerMemoryFeatureFlagsKHX *") int[] pPeerMemoryFeatures) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPeerMemoryFeaturesKHX;
        if (CHECKS) {
            check(__functionAddress);
            check(pPeerMemoryFeatures, 1);
        }
        callPPV(__functionAddress, device.address(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures);
    }

    /** Array version of: {@link #vkGetDeviceGroupSurfacePresentModesKHX GetDeviceGroupSurfacePresentModesKHX} */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModesKHX(VkDevice device, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkDeviceGroupPresentModeFlagsKHX *") int[] pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModesKHX;
        if (CHECKS) {
            check(__functionAddress);
            check(pModes, 1);
        }
        return callPJPI(__functionAddress, device.address(), surface, pModes);
    }

    /** Array version of: {@link #vkGetPhysicalDevicePresentRectanglesKHX GetPhysicalDevicePresentRectanglesKHX} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDevicePresentRectanglesKHX(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") int[] pRectCount, @NativeType("VkRect2D *") VkRect2D.Buffer pRects) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDevicePresentRectanglesKHX;
        if (CHECKS) {
            check(__functionAddress);
            check(pRectCount, 1);
            checkSafe(pRects, pRectCount[0]);
        }
        return callPJPPI(__functionAddress, physicalDevice.address(), surface, pRectCount, memAddressSafe(pRects));
    }

    /** Array version of: {@link #vkAcquireNextImage2KHX AcquireNextImage2KHX} */
    @NativeType("VkResult")
    public static int vkAcquireNextImage2KHX(VkDevice device, @NativeType("const VkAcquireNextImageInfoKHX *") VkAcquireNextImageInfoKHX pAcquireInfo, @NativeType("uint32_t *") int[] pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImage2KHX;
        if (CHECKS) {
            check(__functionAddress);
            check(pImageIndex, 1);
        }
        return callPPPI(__functionAddress, device.address(), pAcquireInfo.address(), pImageIndex);
    }

}