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
 * Applications may wish to update a fixed set of descriptors in a large number of descriptors sets very frequently, i.e. during initializaton phase or if it's required to rebuild descriptor sets for each frame. For those cases it's also not unlikely that all information required to update a single descriptor set is stored in a single struct. This extension provides a way to update a fixed set of descriptors in a single {@code VkDescriptorSet} with a pointer to a user defined data structure which describes the new descriptors.
 * 
 * <h5>Examples</h5>
 * 
 * <code><pre>
 *     // TODO: Write some sample code here.</pre></code>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_descriptor_update_template}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>86</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Markus Tavenrath @mtavenrath</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-01-11</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Interacts with {@link KHRPushDescriptor VK_KHR_push_descriptor}</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Michael Worcester, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public class KHRDescriptorUpdateTemplate {

    /** The extension specification version. */
    public static final int VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME = "VK_KHR_descriptor_update_template";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR = 1000085000;

    /** Extends {@code VkDebugReportObjectTypeEXT}. */
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT = 1000085000;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR = 1000085000;

    /**
     * VkDescriptorUpdateTemplateTypeKHR - Indicates the valid usage of the descriptor update template
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR} specifies that the descriptor update template will be used for descriptor set updates only.</li>
     * <li>{@link #VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR} specifies that the descriptor update template will be used for push descriptor updates only.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDescriptorUpdateTemplateCreateInfoKHR}</p>
     */
    public static final int
        VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR   = 0,
        VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR = 1;

    protected KHRDescriptorUpdateTemplate() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(VKCapabilitiesDevice caps) {
        return checkFunctions(
            caps.vkCreateDescriptorUpdateTemplateKHR, caps.vkDestroyDescriptorUpdateTemplateKHR, caps.vkUpdateDescriptorSetWithTemplateKHR, 
            caps.vkCmdPushDescriptorSetWithTemplateKHR
        );
    }

    // --- [ vkCreateDescriptorUpdateTemplateKHR ] ---

    /** Unsafe version of: {@link #vkCreateDescriptorUpdateTemplateKHR CreateDescriptorUpdateTemplateKHR} */
    public static int nvkCreateDescriptorUpdateTemplateKHR(VkDevice device, long pCreateInfo, long pAllocator, long pDescriptorUpdateTemplate) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorUpdateTemplateKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDescriptorUpdateTemplateCreateInfoKHR.validate(pCreateInfo);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pDescriptorUpdateTemplate);
    }

    /**
     * Create a new descriptor update template.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Updating a large {@code VkDescriptorSet} array <b>can</b> be an expensive operation since an application <b>must</b> specify one {@link VkWriteDescriptorSet} structure for each descriptor or descriptor array to update, each of which re-specifies the same state when updating the same descriptor in multiple descriptor sets. For cases when an application wishes to update the same set of descriptors in multiple descriptor sets allocated using the same {@code VkDescriptorSetLayout}, {@link #vkUpdateDescriptorSetWithTemplateKHR UpdateDescriptorSetWithTemplateKHR} <b>can</b> be used as a replacement for {@link VK10#vkUpdateDescriptorSets UpdateDescriptorSets}.</p>
     * 
     * <p>{@code VkDescriptorUpdateTemplateKHR} allows implementations to convert a set of descriptor update operations on a single descriptor set to an internal format that, in conjunction with {@link #vkUpdateDescriptorSetWithTemplateKHR UpdateDescriptorSetWithTemplateKHR} or {@link #vkCmdPushDescriptorSetWithTemplateKHR CmdPushDescriptorSetWithTemplateKHR} , <b>can</b> be more efficient compared to calling {@link VK10#vkUpdateDescriptorSets UpdateDescriptorSets} or {@link KHRPushDescriptor#vkCmdPushDescriptorSetKHR CmdPushDescriptorSetKHR} . The descriptors themselves are not specified in the {@code VkDescriptorUpdateTemplateKHR}, rather, offsets into an application provided pointer to host memory are specified, which are combined with a pointer passed to {@link #vkUpdateDescriptorSetWithTemplateKHR UpdateDescriptorSetWithTemplateKHR} or {@link #vkCmdPushDescriptorSetWithTemplateKHR CmdPushDescriptorSetWithTemplateKHR} . This allows large batches of updates to be executed without having to convert application data structures into a strictly-defined Vulkan data structure.</p>
     * 
     * <p>To create a descriptor update template, call:</p>
     * 
     * <code><pre>
     * VkResult vkCreateDescriptorUpdateTemplateKHR(
     *     VkDevice                                    device,
     *     const VkDescriptorUpdateTemplateCreateInfoKHR* pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkDescriptorUpdateTemplateKHR*              pDescriptorUpdateTemplate);</pre></code>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkDescriptorUpdateTemplateCreateInfoKHR} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pDescriptorUpdateTemplate} <b>must</b> be a valid pointer to a {@code VkDescriptorUpdateTemplateKHR} handle</li>
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
     * <p>{@link VkAllocationCallbacks}, {@link VkDescriptorUpdateTemplateCreateInfoKHR}</p>
     *
     * @param device                    the logical device that creates the descriptor update template.
     * @param pCreateInfo               a pointer to an instance of the {@link VkDescriptorUpdateTemplateCreateInfoKHR} structure specifying the set of descriptors to update with a single call to {@link #vkCmdPushDescriptorSetWithTemplateKHR CmdPushDescriptorSetWithTemplateKHR} or {@link #vkUpdateDescriptorSetWithTemplateKHR UpdateDescriptorSetWithTemplateKHR}.
     * @param pAllocator                controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pDescriptorUpdateTemplate points to a {@code VkDescriptorUpdateTemplateKHR} handle in which the resulting descriptor update template object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateDescriptorUpdateTemplateKHR(VkDevice device, @NativeType("const VkDescriptorUpdateTemplateCreateInfoKHR *") VkDescriptorUpdateTemplateCreateInfoKHR pCreateInfo, @NativeType("const VkAllocationCallbacks *") VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorUpdateTemplateKHR *") LongBuffer pDescriptorUpdateTemplate) {
        if (CHECKS) {
            check(pDescriptorUpdateTemplate, 1);
        }
        return nvkCreateDescriptorUpdateTemplateKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pDescriptorUpdateTemplate));
    }

    // --- [ vkDestroyDescriptorUpdateTemplateKHR ] ---

    /** Unsafe version of: {@link #vkDestroyDescriptorUpdateTemplateKHR DestroyDescriptorUpdateTemplateKHR} */
    public static void nvkDestroyDescriptorUpdateTemplateKHR(VkDevice device, long descriptorUpdateTemplate, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDescriptorUpdateTemplateKHR;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        callPJPV(__functionAddress, device.address(), descriptorUpdateTemplate, pAllocator);
    }

    /**
     * Destroy a descriptor update template object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a descriptor update template, call:</p>
     * 
     * <code><pre>
     * void vkDestroyDescriptorUpdateTemplateKHR(
     *     VkDevice                                    device,
     *     VkDescriptorUpdateTemplateKHR               descriptorUpdateTemplate,
     *     const VkAllocationCallbacks*                pAllocator);</pre></code>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code descriptorSetLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code descriptorSetLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code descriptorUpdateTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code descriptorUpdateTemplate} <b>must</b> be a valid {@code VkDescriptorUpdateTemplateKHR} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code descriptorUpdateTemplate} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code descriptorUpdateTemplate} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device                   the logical device that has been used to create the descriptor update template
     * @param descriptorUpdateTemplate the descriptor update template to destroy.
     * @param pAllocator               controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyDescriptorUpdateTemplateKHR(VkDevice device, @NativeType("VkDescriptorUpdateTemplateKHR") long descriptorUpdateTemplate, @NativeType("const VkAllocationCallbacks *") VkAllocationCallbacks pAllocator) {
        nvkDestroyDescriptorUpdateTemplateKHR(device, descriptorUpdateTemplate, memAddressSafe(pAllocator));
    }

    // --- [ vkUpdateDescriptorSetWithTemplateKHR ] ---

    /**
     * Update the contents of a descriptor set object using an update template.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Once a {@code VkDescriptorUpdateTemplateKHR} has been created, descriptor sets <b>can</b> be updated by calling:</p>
     * 
     * <code><pre>
     * void vkUpdateDescriptorSetWithTemplateKHR(
     *     VkDevice                                    device,
     *     VkDescriptorSet                             descriptorSet,
     *     VkDescriptorUpdateTemplateKHR               descriptorUpdateTemplate,
     *     const void*                                 pData);</pre></code>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pData} <b>must</b> be a valid pointer to a memory that contains one or more valid instances of {@link VkDescriptorImageInfo}, {@link VkDescriptorBufferInfo}, or {@code VkBufferView} in a layout defined by {@code descriptorUpdateTemplate} when it was created with {@link #vkCreateDescriptorUpdateTemplateKHR CreateDescriptorUpdateTemplateKHR}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code descriptorSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
     * <li>{@code descriptorUpdateTemplate} <b>must</b> be a valid {@code VkDescriptorUpdateTemplateKHR} handle</li>
     * <li>{@code descriptorUpdateTemplate} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code descriptorSet} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <code><pre>
     * struct AppBufferView {
     *     VkBufferView bufferView;
     *     uint32_t     applicationRelatedInformation;
     * };
     * 
     * struct AppDataStructure
     * {
     *     VkDescriptorImageInfo  imageInfo;          // a single image info
     *     VkDescriptorBufferInfo bufferInfoArray[3]; // 3 buffer infos in an array
     *     AppBufferView          bufferView[2];      // An application defined structure containing a bufferView
     *     // ... some more application related data
     * };
     * 
     * const VkDescriptorUpdateTemplateEntryKHR descriptorUpdateTemplateEntries[] =
     * {
     *     // binding to a single image descriptor
     *     {
     *         0,                                           // binding
     *         0,                                           // dstArrayElement
     *         1,                                           // descriptorCount
     *         VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER,   // descriptorType
     *         offsetof(AppDataStructure, imageInfo),       // offset
     *         0                                            // stride is not required if descriptorCount is 1.
     *     },
     * 
     *     // binding to an array of buffer descriptors
     *     {
     *         0,                                           // binding
     *         0,                                           // dstArrayElement
     *         3,                                           // descriptorCount
     *         VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER,           // descriptorType
     *         offsetof(AppDataStructure, bufferInfoArray), // offset
     *         sizeof(VkDescriptorBufferInfo)               // stride, descriptor buffer infos are compact
     *     },
     * 
     *     // binding to an array of buffer views
     *     {
     *         0,                                           // binding
     *         3,                                           // dstArrayElement
     *         1,                                           // descriptorCount
     *         VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER,     // descriptorType
     *         offsetof(AppDataStructure, bufferView),      // offset
     *         sizeof(AppBufferView)                        // stride, bufferViews do not have to be compact
     *     },
     * };
     * 
     * // create an descriptor update template for descriptor set updates
     * const VkDescriptorUpdateTemplateCreateInfoKHR createInfo =
     * {
     *     VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR,  // sType
     *     NULL,                                                          // pNext
     *     0,                                                             // flags
     *     3,                                                             // descriptorUpdateEntryCount
     *     descriptorUpdateTemplateEntries,                               // pDescriptorUpdateEntries
     *     VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR,         // templateType
     *     myLayout,                                                      // descriptorSetLayout
     *     0,                                                             // pipelineBindPoint, ignored by given templateType
     *     0,                                                             // pipelineLayout, ignored by given templateType
     *     0,                                                             // set, ignored by given templateType
     * };
     * 
     * VkDescriptorUpdateTemplateKHR myDescriptorUpdateTemplate;
     * myResult = vkCreateDescriptorUpdateTemplateKHR(
     *     myDevice,
     *     &createInfo,
     *     NULL,
     *     &myDescriptorUpdateTemplate);
     * }
     * 
     * 
     * AppDataStructure appData;
     * 
     * // fill appData here or cache it in your engine
     * vkUpdateDescriptorSetWithTemplateKHR(myDevice, myDescriptorSet, myDescriptorUpdateTemplate, &appData);</pre></code>
     *
     * @param device                   the logical device that updates the descriptor sets.
     * @param descriptorSet            the descriptor set to update
     * @param descriptorUpdateTemplate the {@code VkDescriptorUpdateTemplateKHR} which specifies the update mapping between {@code pData} and the descriptor set to update.
     * @param pData                    a pointer to memory which contains one or more structures of {@link VkDescriptorImageInfo}, {@link VkDescriptorBufferInfo}, or {@code VkBufferView} used to write the descriptors.
     */
    public static void vkUpdateDescriptorSetWithTemplateKHR(VkDevice device, @NativeType("VkDescriptorSet") long descriptorSet, @NativeType("VkDescriptorUpdateTemplateKHR") long descriptorUpdateTemplate, @NativeType("const void *") long pData) {
        long __functionAddress = device.getCapabilities().vkUpdateDescriptorSetWithTemplateKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pData);
        }
        callPJJPV(__functionAddress, device.address(), descriptorSet, descriptorUpdateTemplate, pData);
    }

    // --- [ vkCmdPushDescriptorSetWithTemplateKHR ] ---

    /**
     * Pushes descriptor updates into a command buffer using a descriptor update template.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>It is also possible to use a descriptor update template to specify the push descriptors to update. To do so, call:</p>
     * 
     * <code><pre>
     * void vkCmdPushDescriptorSetWithTemplateKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     VkDescriptorUpdateTemplateKHR               descriptorUpdateTemplate,
     *     VkPipelineLayout                            layout,
     *     uint32_t                                    set,
     *     const void*                                 pData);</pre></code>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The pipelineBindPoint specified during the creation of the descriptor update template <b>must</b> be supported by the {@code commandBuffer}&#8217;s parent {@code VkCommandPool}&#8217;s queue family</li>
     * <li>{@code pData} <b>must</b> be a valid pointer to a memory that contains one or more valid instances of {@link VkDescriptorImageInfo}, {@link VkDescriptorBufferInfo}, or {@code VkBufferView} in a layout defined by {@code descriptorUpdateTemplate} when it was created with {@link #vkCreateDescriptorUpdateTemplateKHR CreateDescriptorUpdateTemplateKHR}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code descriptorUpdateTemplate} <b>must</b> be a valid {@code VkDescriptorUpdateTemplateKHR} handle</li>
     * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>Each of {@code commandBuffer}, {@code descriptorUpdateTemplate}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td><td></td></tr></tbody>
     * </table>
     * 
     * <code><pre>
     * struct AppBufferView {
     *     VkBufferView bufferView;
     *     uint32_t     applicationRelatedInformation;
     * };
     * 
     * struct AppDataStructure
     * {
     *     VkDescriptorImageInfo  imageInfo;          // a single image info
     *     // ... some more application related data
     * };
     * 
     * const VkDescriptorUpdateTemplateEntryKHR descriptorUpdateTemplateEntries[] =
     * {
     *     // binding to a single image descriptor
     *     {
     *         0,                                           // binding
     *         0,                                           // dstArrayElement
     *         1,                                           // descriptorCount
     *         VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER,   // descriptorType
     *         offsetof(AppDataStructure, imageInfo),       // offset
     *         0                                            // stride is not required if descriptorCount is 1.
     *     }
     * 
     * };
     * 
     * // create an descriptor update template for descriptor set updates
     * const VkDescriptorUpdateTemplateCreateInfoKHR createInfo =
     * {
     *     VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR,  // sType
     *     NULL,                                                          // pNext
     *     0,                                                             // flags
     *     1,                                                             // descriptorUpdateEntryCount
     *     descriptorUpdateTemplateEntries,                               // pDescriptorUpdateEntries
     *     VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR,       // templateType
     *     0,                                                             // descriptorSetLayout, ignored by given templateType
     *     VK_PIPELINE_BIND_POINT_GRAPHICS,                               // pipelineBindPoint
     *     myPipelineLayout,                                              // pipelineLayout
     *     0,                                                             // set
     * };
     * 
     * VkDescriptorUpdateTemplateKHR myDescriptorUpdateTemplate;
     * myResult = vkCreateDescriptorUpdateTemplateKHR(
     *     myDevice,
     *     &createInfo,
     *     NULL,
     *     &myDescriptorUpdateTemplate);
     * }
     * 
     * AppDataStructure appData;
     * // fill appData here or cache it in your engine
     * vkCmdPushDescriptorSetWithTemplateKHR(myCmdBuffer, myDescriptorUpdateTemplate, myPipelineLayout, 0,&appData);</pre></code>
     *
     * @param commandBuffer            the command buffer that the descriptors will be recorded in.
     * @param descriptorUpdateTemplate A descriptor update template which defines how to interpret the descriptor information in pData.
     * @param layout                   a {@code VkPipelineLayout} object used to program the bindings. It <b>must</b> be compatible with the layout used to create the {@code descriptorUpdateTemplate} handle.
     * @param set                      the set number of the descriptor set in the pipeline layout that will be updated. This <b>must</b> be the same number used to create the {@code descriptorUpdateTemplate} handle.
     * @param pData                    Points to memory which contains the descriptors for the templated update.
     */
    public static void vkCmdPushDescriptorSetWithTemplateKHR(VkCommandBuffer commandBuffer, @NativeType("VkDescriptorUpdateTemplateKHR") long descriptorUpdateTemplate, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int set, @NativeType("const void *") long pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSetWithTemplateKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pData);
        }
        callPJJPV(__functionAddress, commandBuffer.address(), descriptorUpdateTemplate, layout, set, pData);
    }

    /** Array version of: {@link #vkCreateDescriptorUpdateTemplateKHR CreateDescriptorUpdateTemplateKHR} */
    @NativeType("VkResult")
    public static int vkCreateDescriptorUpdateTemplateKHR(VkDevice device, @NativeType("const VkDescriptorUpdateTemplateCreateInfoKHR *") VkDescriptorUpdateTemplateCreateInfoKHR pCreateInfo, @NativeType("const VkAllocationCallbacks *") VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorUpdateTemplateKHR *") long[] pDescriptorUpdateTemplate) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorUpdateTemplateKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pDescriptorUpdateTemplate, 1);
            VkDescriptorUpdateTemplateCreateInfoKHR.validate(pCreateInfo.address());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pDescriptorUpdateTemplate);
    }

}