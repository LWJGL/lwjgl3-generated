/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Application-defined debug report callback function.
 * 
 * <h5>C Specification</h5>
 * 
 * <p>The prototype for the callback function implemented by the application is:</p>
 * 
 * <pre><code>typedef VkBool32 (VKAPI_PTR *PFN_vkDebugReportCallbackEXT)(
    VkDebugReportFlagsEXT                       flags,
    VkDebugReportObjectTypeEXT                  objectType,
    uint64_t                                    object,
    size_t                                      location,
    int32_t                                     messageCode,
    const char*                                 pLayerPrefix,
    const char*                                 pMessage,
    void*                                       pUserData);</code></pre>
 * 
 * <h5>Description</h5>
 * 
 * <p>The callback returns a {@code VkBool32} that indicates to the calling layer if the Vulkan call <b>should</b> be aborted or not. Applications <b>should</b> always return {@link VK10#VK_FALSE FALSE} so that they see the same behavior with and without validation layers enabled.</p>
 * 
 * <p>If the application returns {@link VK10#VK_TRUE TRUE} from its callback and the Vulkan call being aborted returns a {@code VkResult}, the layer will return {@link EXTDebugReport#VK_ERROR_VALIDATION_FAILED_EXT ERROR_VALIDATION_FAILED_EXT}.</p>
 * 
 * <p>The object types are:</p>
 * 
 * <pre><code>typedef enum VkDebugReportObjectTypeEXT {
    VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT = 0,
    VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT = 1,
    VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT = 2,
    VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT = 3,
    VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT = 4,
    VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT = 5,
    VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT = 6,
    VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT = 7,
    VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT = 8,
    VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT = 9,
    VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT = 10,
    VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT = 11,
    VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT = 12,
    VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT = 13,
    VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT = 14,
    VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT = 15,
    VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT = 16,
    VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT = 17,
    VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT = 18,
    VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT = 19,
    VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT = 20,
    VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT = 21,
    VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT = 22,
    VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT = 23,
    VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT = 24,
    VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT = 25,
    VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT = 26,
    VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT = 27,
    VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = 28,
    VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT = 29,
    VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT = 30,
    VK_DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT = 31,
    VK_DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT = 32,
    VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT = 1000085000,
} VkDebugReportObjectTypeEXT;</code></pre>
 * 
 * <ul>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT} is an unknown object.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT} is a {@code VkInstance}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT} is a {@code VkPhysicalDevice}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT} is a {@code VkDevice}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT} is a {@code VkQueue}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT} is a {@code VkSemaphore}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT} is a {@code VkCommandBuffer}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT} is a {@code VkFence}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT} is a {@code VkDeviceMemory}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT} is a {@code VkBuffer}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT} is a {@code VkImage}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT} is a {@code VkEvent}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT} is a {@code VkQueryPool}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT} is a {@code VkBufferView}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT} is a {@code VkImageView}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT} is a {@code VkShaderModule}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT} is a {@code VkPipelineCache}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT} is a {@code VkPipelineLayout}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT} is a {@code VkRenderPass}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT} is a {@code VkPipeline}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT} is a {@code VkDescriptorSetLayout}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT} is a {@code VkSampler}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT} is a {@code VkDescriptorPool}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT} is a {@code VkDescriptorSet}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT} is a {@code VkFramebuffer}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT} is a {@code VkCommandPool}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT} is a {@code VkSurfaceKHR}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT} is a {@code VkSwapchainKHR}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT} is a {@code VkDebugReportCallbackEXT}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT} is a {@code VkDisplayKHR}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT} is a {@code VkDisplayModeKHR}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT} is a {@code VkObjectTableNVX}.</li>
 * <li>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT} is a {@code VkIndirectCommandsLayoutNVX}.</li>
 * <li>{@link KHRDescriptorUpdateTemplate#VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT} is a {@code VkDescriptorUpdateTemplateKHR}.</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The primary expected use of {@link EXTDebugReport#VK_ERROR_VALIDATION_FAILED_EXT ERROR_VALIDATION_FAILED_EXT} is for validation layer testing. It is not expected that an application would see this error code during normal use of the validation layers.</p>
 * </div>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDebugReportCallbackCreateInfoEXT}</p>
 */
public abstract class VkDebugReportCallbackEXT extends Callback implements VkDebugReportCallbackEXTI {

    /** Creates a {@code VkDebugReportCallbackEXT} instance from the specified function pointer. */
    public static VkDebugReportCallbackEXT create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        VkDebugReportCallbackEXTI instance = Callback.get(functionPointer);
        return instance instanceof VkDebugReportCallbackEXT
            ? (VkDebugReportCallbackEXT)instance
            : new Container(functionPointer, instance);
    }

    /** Creates a {@code VkDebugReportCallbackEXT} instance that delegates to the specified {@code VkDebugReportCallbackEXTI} instance. */
    public static VkDebugReportCallbackEXT create(VkDebugReportCallbackEXTI instance) {
        return instance instanceof VkDebugReportCallbackEXT
            ? (VkDebugReportCallbackEXT)instance
            : new Container(instance.address(), instance);
    }

    protected VkDebugReportCallbackEXT() {
        super(SIGNATURE);
    }

    private VkDebugReportCallbackEXT(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@link VkDebugReportCallbackEXT} argument to a String.
     *
     * <p>This method may only be used inside a {@code VkDebugReportCallbackEXT} invocation.</p>
     *
     * @param string the argument to decode
     *
     * @return the message as a String
     */
    public static String getString(long string) {
        return memUTF8(string);
    }

    private static final class Container extends VkDebugReportCallbackEXT {

        private final VkDebugReportCallbackEXTI delegate;

        Container(long functionPointer, VkDebugReportCallbackEXTI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage, long pUserData) {
            return delegate.invoke(flags, objectType, object, location, messageCode, pLayerPrefix, pMessage, pUserData);
        }

    }

}