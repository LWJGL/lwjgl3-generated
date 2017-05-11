/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters of a newly created object table.
 * 
 * <h5>Description</h5>
 * 
 * <p>Types which <b>can</b> be set in {@code pObjectEntryTypes} are:</p>
 * 
 * <pre><code>typedef enum VkObjectEntryTypeNVX {
    VK_OBJECT_ENTRY_DESCRIPTOR_SET_NVX = 0,
    VK_OBJECT_ENTRY_PIPELINE_NVX = 1,
    VK_OBJECT_ENTRY_INDEX_BUFFER_NVX = 2,
    VK_OBJECT_ENTRY_VERTEX_BUFFER_NVX = 3,
    VK_OBJECT_ENTRY_PUSH_CONSTANT_NVX = 4,
} VkObjectEntryTypeNVX;</code></pre>
 * 
 * <ul>
 * <li>{@link NVXDeviceGeneratedCommands#VK_OBJECT_ENTRY_DESCRIPTOR_SET_NVX OBJECT_ENTRY_DESCRIPTOR_SET_NVX} indicates a {@code VkDescriptorSet} resource entry that is registered via {@link VkObjectTableDescriptorSetEntryNVX}.</li>
 * <li>{@link NVXDeviceGeneratedCommands#VK_OBJECT_ENTRY_PIPELINE_NVX OBJECT_ENTRY_PIPELINE_NVX} indicates a {@code VkPipeline} resource entry that is registered via {@link VkObjectTablePipelineEntryNVX}.</li>
 * <li>{@link NVXDeviceGeneratedCommands#VK_OBJECT_ENTRY_INDEX_BUFFER_NVX OBJECT_ENTRY_INDEX_BUFFER_NVX} indicates a {@code VkBuffer} resource entry that is registered via {@link VkObjectTableIndexBufferEntryNVX}.</li>
 * <li>{@link NVXDeviceGeneratedCommands#VK_OBJECT_ENTRY_VERTEX_BUFFER_NVX OBJECT_ENTRY_VERTEX_BUFFER_NVX} indicates a {@code VkBuffer} resource entry that is registered via {@link VkObjectTableVertexBufferEntryNVX}.</li>
 * <li>{@link NVXDeviceGeneratedCommands#VK_OBJECT_ENTRY_PUSH_CONSTANT_NVX OBJECT_ENTRY_PUSH_CONSTANT_NVX} indicates the resource entry is registered via {@link VkObjectTablePushConstantEntryNVX}.</li>
 * </ul>
 * 
 * <p>Bits which <b>can</b> be set in {@code pObjectEntryUsageFlags} are:</p>
 * 
 * <pre><code>typedef enum VkObjectEntryUsageFlagBitsNVX {
    VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX = 0x00000001,
    VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX = 0x00000002,
} VkObjectEntryUsageFlagBitsNVX;</code></pre>
 * 
 * <ul>
 * <li>{@link NVXDeviceGeneratedCommands#VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX} indicates that the resource is bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
 * <li>{@link NVXDeviceGeneratedCommands#VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX} indicates that the resource is bound to {@link VK10#VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@link VkDeviceGeneratedCommandsFeaturesNVX}{@code ::computeBindingPointSupport} feature is not enabled, {@code pObjectEntryUsageFlags} <b>must</b> not contain {@link NVXDeviceGeneratedCommands#VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX}</li>
 * <li>Any value within {@code pObjectEntryCounts} <b>must</b> not exceed {@link VkDeviceGeneratedCommandsLimitsNVX}{@code ::maxObjectEntryCounts}</li>
 * <li>{@code maxUniformBuffersPerDescriptor} <b>must</b> be within the limits supported by the device.</li>
 * <li>{@code maxStorageBuffersPerDescriptor} <b>must</b> be within the limits supported by the device.</li>
 * <li>{@code maxStorageImagesPerDescriptor} <b>must</b> be within the limits supported by the device.</li>
 * <li>{@code maxSampledImagesPerDescriptor} <b>must</b> be within the limits supported by the device.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXDeviceGeneratedCommands#VK_STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pObjectEntryTypes} <b>must</b> be a pointer to an array of {@code objectCount} valid {@code VkObjectEntryTypeNVX} values</li>
 * <li>{@code pObjectEntryCounts} <b>must</b> be a pointer to an array of {@code objectCount} {@code uint32_t} values</li>
 * <li>{@code pObjectEntryUsageFlags} <b>must</b> be a pointer to an array of {@code objectCount} valid combinations of {@code VkObjectEntryUsageFlagBitsNVX} values</li>
 * <li>Each element of {@code pObjectEntryUsageFlags} <b>must</b> not be 0</li>
 * <li>{@code objectCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVXDeviceGeneratedCommands#vkCreateObjectTableNVX CreateObjectTableNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code objectCount} &ndash; the number of entry configurations that the object table supports.</li>
 * <li>{@code pObjectEntryTypes} &ndash; an array of {@code VkObjectEntryTypeNVX} providing the entry type of a given configuration.</li>
 * <li>{@code pObjectEntryCounts} &ndash; an array of counts how many objects can be registered in the table.</li>
 * <li>{@code pObjectEntryUsageFlags} &ndash; an array of bitmasks describing the binding usage of the entry. See {@code VkObjectEntryUsageFlagBitsNVX} below for a description of the supported bits.</li>
 * <li>{@code maxUniformBuffersPerDescriptor} &ndash; the maximum number of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} used by any single registered {@code VkDescriptorSet} in this table.</li>
 * <li>{@code maxStorageBuffersPerDescriptor} &ndash; the maximum number of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} used by any single registered {@code VkDescriptorSet} in this table.</li>
 * <li>{@code maxStorageImagesPerDescriptor} &ndash; the maximum number of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} used by any single registered {@code VkDescriptorSet} in this table.</li>
 * <li>{@code maxSampledImagesPerDescriptor} &ndash; the maximum number of {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} used by any single registered {@code VkDescriptorSet} in this table.</li>
 * <li>{@code maxPipelineLayouts} &ndash; the maximum number of unique {@code VkPipelineLayout} used by any registered {@code VkDescriptorSet} or {@code VkPipeline} in this table.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkObjectTableCreateInfoNVX {
    VkStructureType sType;
    const void * pNext;
    uint32_t objectCount;
    const VkObjectEntryTypeNVX * pObjectEntryTypes;
    const uint32_t * pObjectEntryCounts;
    const VkObjectEntryUsageFlagsNVX * pObjectEntryUsageFlags;
    uint32_t maxUniformBuffersPerDescriptor;
    uint32_t maxStorageBuffersPerDescriptor;
    uint32_t maxStorageImagesPerDescriptor;
    uint32_t maxSampledImagesPerDescriptor;
    uint32_t maxPipelineLayouts;
}</code></pre>
 */
public class VkObjectTableCreateInfoNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OBJECTCOUNT,
        POBJECTENTRYTYPES,
        POBJECTENTRYCOUNTS,
        POBJECTENTRYUSAGEFLAGS,
        MAXUNIFORMBUFFERSPERDESCRIPTOR,
        MAXSTORAGEBUFFERSPERDESCRIPTOR,
        MAXSTORAGEIMAGESPERDESCRIPTOR,
        MAXSAMPLEDIMAGESPERDESCRIPTOR,
        MAXPIPELINELAYOUTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OBJECTCOUNT = layout.offsetof(2);
        POBJECTENTRYTYPES = layout.offsetof(3);
        POBJECTENTRYCOUNTS = layout.offsetof(4);
        POBJECTENTRYUSAGEFLAGS = layout.offsetof(5);
        MAXUNIFORMBUFFERSPERDESCRIPTOR = layout.offsetof(6);
        MAXSTORAGEBUFFERSPERDESCRIPTOR = layout.offsetof(7);
        MAXSTORAGEIMAGESPERDESCRIPTOR = layout.offsetof(8);
        MAXSAMPLEDIMAGESPERDESCRIPTOR = layout.offsetof(9);
        MAXPIPELINELAYOUTS = layout.offsetof(10);
    }

    VkObjectTableCreateInfoNVX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkObjectTableCreateInfoNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkObjectTableCreateInfoNVX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code objectCount} field. */
    public int objectCount() { return nobjectCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pObjectEntryTypes} field. */
    public IntBuffer pObjectEntryTypes() { return npObjectEntryTypes(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pObjectEntryCounts} field. */
    public IntBuffer pObjectEntryCounts() { return npObjectEntryCounts(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pObjectEntryUsageFlags} field. */
    public IntBuffer pObjectEntryUsageFlags() { return npObjectEntryUsageFlags(address()); }
    /** Returns the value of the {@code maxUniformBuffersPerDescriptor} field. */
    public int maxUniformBuffersPerDescriptor() { return nmaxUniformBuffersPerDescriptor(address()); }
    /** Returns the value of the {@code maxStorageBuffersPerDescriptor} field. */
    public int maxStorageBuffersPerDescriptor() { return nmaxStorageBuffersPerDescriptor(address()); }
    /** Returns the value of the {@code maxStorageImagesPerDescriptor} field. */
    public int maxStorageImagesPerDescriptor() { return nmaxStorageImagesPerDescriptor(address()); }
    /** Returns the value of the {@code maxSampledImagesPerDescriptor} field. */
    public int maxSampledImagesPerDescriptor() { return nmaxSampledImagesPerDescriptor(address()); }
    /** Returns the value of the {@code maxPipelineLayouts} field. */
    public int maxPipelineLayouts() { return nmaxPipelineLayouts(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkObjectTableCreateInfoNVX sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkObjectTableCreateInfoNVX pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code objectCount} field. */
    public VkObjectTableCreateInfoNVX objectCount(int value) { nobjectCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pObjectEntryTypes} field. */
    public VkObjectTableCreateInfoNVX pObjectEntryTypes(IntBuffer value) { npObjectEntryTypes(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pObjectEntryCounts} field. */
    public VkObjectTableCreateInfoNVX pObjectEntryCounts(IntBuffer value) { npObjectEntryCounts(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pObjectEntryUsageFlags} field. */
    public VkObjectTableCreateInfoNVX pObjectEntryUsageFlags(IntBuffer value) { npObjectEntryUsageFlags(address(), value); return this; }
    /** Sets the specified value to the {@code maxUniformBuffersPerDescriptor} field. */
    public VkObjectTableCreateInfoNVX maxUniformBuffersPerDescriptor(int value) { nmaxUniformBuffersPerDescriptor(address(), value); return this; }
    /** Sets the specified value to the {@code maxStorageBuffersPerDescriptor} field. */
    public VkObjectTableCreateInfoNVX maxStorageBuffersPerDescriptor(int value) { nmaxStorageBuffersPerDescriptor(address(), value); return this; }
    /** Sets the specified value to the {@code maxStorageImagesPerDescriptor} field. */
    public VkObjectTableCreateInfoNVX maxStorageImagesPerDescriptor(int value) { nmaxStorageImagesPerDescriptor(address(), value); return this; }
    /** Sets the specified value to the {@code maxSampledImagesPerDescriptor} field. */
    public VkObjectTableCreateInfoNVX maxSampledImagesPerDescriptor(int value) { nmaxSampledImagesPerDescriptor(address(), value); return this; }
    /** Sets the specified value to the {@code maxPipelineLayouts} field. */
    public VkObjectTableCreateInfoNVX maxPipelineLayouts(int value) { nmaxPipelineLayouts(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkObjectTableCreateInfoNVX set(
        int sType,
        long pNext,
        int objectCount,
        IntBuffer pObjectEntryTypes,
        IntBuffer pObjectEntryCounts,
        IntBuffer pObjectEntryUsageFlags,
        int maxUniformBuffersPerDescriptor,
        int maxStorageBuffersPerDescriptor,
        int maxStorageImagesPerDescriptor,
        int maxSampledImagesPerDescriptor,
        int maxPipelineLayouts
    ) {
        sType(sType);
        pNext(pNext);
        objectCount(objectCount);
        pObjectEntryTypes(pObjectEntryTypes);
        pObjectEntryCounts(pObjectEntryCounts);
        pObjectEntryUsageFlags(pObjectEntryUsageFlags);
        maxUniformBuffersPerDescriptor(maxUniformBuffersPerDescriptor);
        maxStorageBuffersPerDescriptor(maxStorageBuffersPerDescriptor);
        maxStorageImagesPerDescriptor(maxStorageImagesPerDescriptor);
        maxSampledImagesPerDescriptor(maxSampledImagesPerDescriptor);
        maxPipelineLayouts(maxPipelineLayouts);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkObjectTableCreateInfoNVX set(VkObjectTableCreateInfoNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkObjectTableCreateInfoNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkObjectTableCreateInfoNVX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkObjectTableCreateInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkObjectTableCreateInfoNVX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkObjectTableCreateInfoNVX} instance allocated with {@link BufferUtils}. */
    public static VkObjectTableCreateInfoNVX create() {
        return new VkObjectTableCreateInfoNVX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkObjectTableCreateInfoNVX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkObjectTableCreateInfoNVX create(long address) {
        return address == NULL ? null : new VkObjectTableCreateInfoNVX(address, null);
    }

    /**
     * Returns a new {@link VkObjectTableCreateInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkObjectTableCreateInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkObjectTableCreateInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkObjectTableCreateInfoNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkObjectTableCreateInfoNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkObjectTableCreateInfoNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkObjectTableCreateInfoNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkObjectTableCreateInfoNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkObjectTableCreateInfoNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkObjectTableCreateInfoNVX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkObjectTableCreateInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkObjectTableCreateInfoNVX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkObjectTableCreateInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkObjectTableCreateInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkObjectTableCreateInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkObjectTableCreateInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkObjectTableCreateInfoNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkObjectTableCreateInfoNVX.PNEXT); }
    /** Unsafe version of {@link #objectCount}. */
    public static int nobjectCount(long struct) { return memGetInt(struct + VkObjectTableCreateInfoNVX.OBJECTCOUNT); }
    /** Unsafe version of {@link #pObjectEntryTypes() pObjectEntryTypes}. */
    public static IntBuffer npObjectEntryTypes(long struct) { return memIntBuffer(memGetAddress(struct + VkObjectTableCreateInfoNVX.POBJECTENTRYTYPES), nobjectCount(struct)); }
    /** Unsafe version of {@link #pObjectEntryCounts() pObjectEntryCounts}. */
    public static IntBuffer npObjectEntryCounts(long struct) { return memIntBuffer(memGetAddress(struct + VkObjectTableCreateInfoNVX.POBJECTENTRYCOUNTS), nobjectCount(struct)); }
    /** Unsafe version of {@link #pObjectEntryUsageFlags() pObjectEntryUsageFlags}. */
    public static IntBuffer npObjectEntryUsageFlags(long struct) { return memIntBuffer(memGetAddress(struct + VkObjectTableCreateInfoNVX.POBJECTENTRYUSAGEFLAGS), nobjectCount(struct)); }
    /** Unsafe version of {@link #maxUniformBuffersPerDescriptor}. */
    public static int nmaxUniformBuffersPerDescriptor(long struct) { return memGetInt(struct + VkObjectTableCreateInfoNVX.MAXUNIFORMBUFFERSPERDESCRIPTOR); }
    /** Unsafe version of {@link #maxStorageBuffersPerDescriptor}. */
    public static int nmaxStorageBuffersPerDescriptor(long struct) { return memGetInt(struct + VkObjectTableCreateInfoNVX.MAXSTORAGEBUFFERSPERDESCRIPTOR); }
    /** Unsafe version of {@link #maxStorageImagesPerDescriptor}. */
    public static int nmaxStorageImagesPerDescriptor(long struct) { return memGetInt(struct + VkObjectTableCreateInfoNVX.MAXSTORAGEIMAGESPERDESCRIPTOR); }
    /** Unsafe version of {@link #maxSampledImagesPerDescriptor}. */
    public static int nmaxSampledImagesPerDescriptor(long struct) { return memGetInt(struct + VkObjectTableCreateInfoNVX.MAXSAMPLEDIMAGESPERDESCRIPTOR); }
    /** Unsafe version of {@link #maxPipelineLayouts}. */
    public static int nmaxPipelineLayouts(long struct) { return memGetInt(struct + VkObjectTableCreateInfoNVX.MAXPIPELINELAYOUTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkObjectTableCreateInfoNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkObjectTableCreateInfoNVX.PNEXT, value); }
    /** Sets the specified value to the {@code objectCount} field of the specified {@code struct}. */
    public static void nobjectCount(long struct, int value) { memPutInt(struct + VkObjectTableCreateInfoNVX.OBJECTCOUNT, value); }
    /** Unsafe version of {@link #pObjectEntryTypes(IntBuffer) pObjectEntryTypes}. */
    public static void npObjectEntryTypes(long struct, IntBuffer value) { memPutAddress(struct + VkObjectTableCreateInfoNVX.POBJECTENTRYTYPES, memAddress(value)); }
    /** Unsafe version of {@link #pObjectEntryCounts(IntBuffer) pObjectEntryCounts}. */
    public static void npObjectEntryCounts(long struct, IntBuffer value) { memPutAddress(struct + VkObjectTableCreateInfoNVX.POBJECTENTRYCOUNTS, memAddress(value)); }
    /** Unsafe version of {@link #pObjectEntryUsageFlags(IntBuffer) pObjectEntryUsageFlags}. */
    public static void npObjectEntryUsageFlags(long struct, IntBuffer value) { memPutAddress(struct + VkObjectTableCreateInfoNVX.POBJECTENTRYUSAGEFLAGS, memAddress(value)); }
    /** Unsafe version of {@link #maxUniformBuffersPerDescriptor(int) maxUniformBuffersPerDescriptor}. */
    public static void nmaxUniformBuffersPerDescriptor(long struct, int value) { memPutInt(struct + VkObjectTableCreateInfoNVX.MAXUNIFORMBUFFERSPERDESCRIPTOR, value); }
    /** Unsafe version of {@link #maxStorageBuffersPerDescriptor(int) maxStorageBuffersPerDescriptor}. */
    public static void nmaxStorageBuffersPerDescriptor(long struct, int value) { memPutInt(struct + VkObjectTableCreateInfoNVX.MAXSTORAGEBUFFERSPERDESCRIPTOR, value); }
    /** Unsafe version of {@link #maxStorageImagesPerDescriptor(int) maxStorageImagesPerDescriptor}. */
    public static void nmaxStorageImagesPerDescriptor(long struct, int value) { memPutInt(struct + VkObjectTableCreateInfoNVX.MAXSTORAGEIMAGESPERDESCRIPTOR, value); }
    /** Unsafe version of {@link #maxSampledImagesPerDescriptor(int) maxSampledImagesPerDescriptor}. */
    public static void nmaxSampledImagesPerDescriptor(long struct, int value) { memPutInt(struct + VkObjectTableCreateInfoNVX.MAXSAMPLEDIMAGESPERDESCRIPTOR, value); }
    /** Unsafe version of {@link #maxPipelineLayouts(int) maxPipelineLayouts}. */
    public static void nmaxPipelineLayouts(long struct, int value) { memPutInt(struct + VkObjectTableCreateInfoNVX.MAXPIPELINELAYOUTS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkObjectTableCreateInfoNVX.POBJECTENTRYTYPES));
        check(memGetAddress(struct + VkObjectTableCreateInfoNVX.POBJECTENTRYCOUNTS));
        check(memGetAddress(struct + VkObjectTableCreateInfoNVX.POBJECTENTRYUSAGEFLAGS));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkObjectTableCreateInfoNVX} structs. */
    public static class Buffer extends StructBuffer<VkObjectTableCreateInfoNVX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkObjectTableCreateInfoNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkObjectTableCreateInfoNVX#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkObjectTableCreateInfoNVX newInstance(long address) {
            return new VkObjectTableCreateInfoNVX(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkObjectTableCreateInfoNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkObjectTableCreateInfoNVX.npNext(address()); }
        /** Returns the value of the {@code objectCount} field. */
        public int objectCount() { return VkObjectTableCreateInfoNVX.nobjectCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pObjectEntryTypes} field. */
        public IntBuffer pObjectEntryTypes() { return VkObjectTableCreateInfoNVX.npObjectEntryTypes(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pObjectEntryCounts} field. */
        public IntBuffer pObjectEntryCounts() { return VkObjectTableCreateInfoNVX.npObjectEntryCounts(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pObjectEntryUsageFlags} field. */
        public IntBuffer pObjectEntryUsageFlags() { return VkObjectTableCreateInfoNVX.npObjectEntryUsageFlags(address()); }
        /** Returns the value of the {@code maxUniformBuffersPerDescriptor} field. */
        public int maxUniformBuffersPerDescriptor() { return VkObjectTableCreateInfoNVX.nmaxUniformBuffersPerDescriptor(address()); }
        /** Returns the value of the {@code maxStorageBuffersPerDescriptor} field. */
        public int maxStorageBuffersPerDescriptor() { return VkObjectTableCreateInfoNVX.nmaxStorageBuffersPerDescriptor(address()); }
        /** Returns the value of the {@code maxStorageImagesPerDescriptor} field. */
        public int maxStorageImagesPerDescriptor() { return VkObjectTableCreateInfoNVX.nmaxStorageImagesPerDescriptor(address()); }
        /** Returns the value of the {@code maxSampledImagesPerDescriptor} field. */
        public int maxSampledImagesPerDescriptor() { return VkObjectTableCreateInfoNVX.nmaxSampledImagesPerDescriptor(address()); }
        /** Returns the value of the {@code maxPipelineLayouts} field. */
        public int maxPipelineLayouts() { return VkObjectTableCreateInfoNVX.nmaxPipelineLayouts(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkObjectTableCreateInfoNVX.Buffer sType(int value) { VkObjectTableCreateInfoNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkObjectTableCreateInfoNVX.Buffer pNext(long value) { VkObjectTableCreateInfoNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code objectCount} field. */
        public VkObjectTableCreateInfoNVX.Buffer objectCount(int value) { VkObjectTableCreateInfoNVX.nobjectCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pObjectEntryTypes} field. */
        public VkObjectTableCreateInfoNVX.Buffer pObjectEntryTypes(IntBuffer value) { VkObjectTableCreateInfoNVX.npObjectEntryTypes(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pObjectEntryCounts} field. */
        public VkObjectTableCreateInfoNVX.Buffer pObjectEntryCounts(IntBuffer value) { VkObjectTableCreateInfoNVX.npObjectEntryCounts(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pObjectEntryUsageFlags} field. */
        public VkObjectTableCreateInfoNVX.Buffer pObjectEntryUsageFlags(IntBuffer value) { VkObjectTableCreateInfoNVX.npObjectEntryUsageFlags(address(), value); return this; }
        /** Sets the specified value to the {@code maxUniformBuffersPerDescriptor} field. */
        public VkObjectTableCreateInfoNVX.Buffer maxUniformBuffersPerDescriptor(int value) { VkObjectTableCreateInfoNVX.nmaxUniformBuffersPerDescriptor(address(), value); return this; }
        /** Sets the specified value to the {@code maxStorageBuffersPerDescriptor} field. */
        public VkObjectTableCreateInfoNVX.Buffer maxStorageBuffersPerDescriptor(int value) { VkObjectTableCreateInfoNVX.nmaxStorageBuffersPerDescriptor(address(), value); return this; }
        /** Sets the specified value to the {@code maxStorageImagesPerDescriptor} field. */
        public VkObjectTableCreateInfoNVX.Buffer maxStorageImagesPerDescriptor(int value) { VkObjectTableCreateInfoNVX.nmaxStorageImagesPerDescriptor(address(), value); return this; }
        /** Sets the specified value to the {@code maxSampledImagesPerDescriptor} field. */
        public VkObjectTableCreateInfoNVX.Buffer maxSampledImagesPerDescriptor(int value) { VkObjectTableCreateInfoNVX.nmaxSampledImagesPerDescriptor(address(), value); return this; }
        /** Sets the specified value to the {@code maxPipelineLayouts} field. */
        public VkObjectTableCreateInfoNVX.Buffer maxPipelineLayouts(int value) { VkObjectTableCreateInfoNVX.nmaxPipelineLayouts(address(), value); return this; }

    }

}