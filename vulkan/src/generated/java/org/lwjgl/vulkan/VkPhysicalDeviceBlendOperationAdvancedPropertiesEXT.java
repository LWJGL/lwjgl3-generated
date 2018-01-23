/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure describing advanced blending limits that can be supported by an implementation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTBlendOperationAdvanced#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <p>If the {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2KHR}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code advancedBlendMaxColorAttachments} &ndash; one greater than the highest color attachment index that <b>can</b> be used in a subpass, for a pipeline that uses an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#framebuffer-blend-advanced">advanced blend operation</a>.</li>
 * <li>{@code advancedBlendIndependentBlend} &ndash; indicates whether advanced blend operations <b>can</b> vary per-attachment.</li>
 * <li>{@code advancedBlendNonPremultipliedSrcColor} &ndash; indicates whether the source color <b>can</b> be treated as non-premultiplied. If this is {@link VK10#VK_FALSE FALSE}, then {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT}{@code ::srcPremultiplied} <b>must</b> be {@link VK10#VK_TRUE TRUE}.</li>
 * <li>{@code advancedBlendNonPremultipliedDstColor} &ndash; indicates whether the destination color <b>can</b> be treated as non-premultiplied. If this is {@link VK10#VK_FALSE FALSE}, then {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT}{@code ::dstPremultiplied} <b>must</b> be {@link VK10#VK_TRUE TRUE}.</li>
 * <li>{@code advancedBlendCorrelatedOverlap} &ndash; indicates whether the overlap mode <b>can</b> be treated as correlated. If this is {@link VK10#VK_FALSE FALSE}, then {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT}{@code ::blendOverlap} <b>must</b> be {@link EXTBlendOperationAdvanced#VK_BLEND_OVERLAP_UNCORRELATED_EXT BLEND_OVERLAP_UNCORRELATED_EXT}.</li>
 * <li>{@code advancedBlendAllOperations} &ndash; indicates whether all advanced blend operation enums are supported. See the valid usage of {@link VkPipelineColorBlendAttachmentState}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t advancedBlendMaxColorAttachments;
 *     VkBool32 advancedBlendIndependentBlend;
 *     VkBool32 advancedBlendNonPremultipliedSrcColor;
 *     VkBool32 advancedBlendNonPremultipliedDstColor;
 *     VkBool32 advancedBlendCorrelatedOverlap;
 *     VkBool32 advancedBlendAllOperations;
 * }</pre></code>
 */
public class VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ADVANCEDBLENDMAXCOLORATTACHMENTS,
        ADVANCEDBLENDINDEPENDENTBLEND,
        ADVANCEDBLENDNONPREMULTIPLIEDSRCCOLOR,
        ADVANCEDBLENDNONPREMULTIPLIEDDSTCOLOR,
        ADVANCEDBLENDCORRELATEDOVERLAP,
        ADVANCEDBLENDALLOPERATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
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
        ADVANCEDBLENDMAXCOLORATTACHMENTS = layout.offsetof(2);
        ADVANCEDBLENDINDEPENDENTBLEND = layout.offsetof(3);
        ADVANCEDBLENDNONPREMULTIPLIEDSRCCOLOR = layout.offsetof(4);
        ADVANCEDBLENDNONPREMULTIPLIEDDSTCOLOR = layout.offsetof(5);
        ADVANCEDBLENDCORRELATEDOVERLAP = layout.offsetof(6);
        ADVANCEDBLENDALLOPERATIONS = layout.offsetof(7);
    }

    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code advancedBlendMaxColorAttachments} field. */
    @NativeType("uint32_t")
    public int advancedBlendMaxColorAttachments() { return nadvancedBlendMaxColorAttachments(address()); }
    /** Returns the value of the {@code advancedBlendIndependentBlend} field. */
    @NativeType("VkBool32")
    public boolean advancedBlendIndependentBlend() { return nadvancedBlendIndependentBlend(address()) != 0; }
    /** Returns the value of the {@code advancedBlendNonPremultipliedSrcColor} field. */
    @NativeType("VkBool32")
    public boolean advancedBlendNonPremultipliedSrcColor() { return nadvancedBlendNonPremultipliedSrcColor(address()) != 0; }
    /** Returns the value of the {@code advancedBlendNonPremultipliedDstColor} field. */
    @NativeType("VkBool32")
    public boolean advancedBlendNonPremultipliedDstColor() { return nadvancedBlendNonPremultipliedDstColor(address()) != 0; }
    /** Returns the value of the {@code advancedBlendCorrelatedOverlap} field. */
    @NativeType("VkBool32")
    public boolean advancedBlendCorrelatedOverlap() { return nadvancedBlendCorrelatedOverlap(address()) != 0; }
    /** Returns the value of the {@code advancedBlendAllOperations} field. */
    @NativeType("VkBool32")
    public boolean advancedBlendAllOperations() { return nadvancedBlendAllOperations(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT create(long address) {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #advancedBlendMaxColorAttachments}. */
    public static int nadvancedBlendMaxColorAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.ADVANCEDBLENDMAXCOLORATTACHMENTS); }
    /** Unsafe version of {@link #advancedBlendIndependentBlend}. */
    public static int nadvancedBlendIndependentBlend(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.ADVANCEDBLENDINDEPENDENTBLEND); }
    /** Unsafe version of {@link #advancedBlendNonPremultipliedSrcColor}. */
    public static int nadvancedBlendNonPremultipliedSrcColor(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.ADVANCEDBLENDNONPREMULTIPLIEDSRCCOLOR); }
    /** Unsafe version of {@link #advancedBlendNonPremultipliedDstColor}. */
    public static int nadvancedBlendNonPremultipliedDstColor(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.ADVANCEDBLENDNONPREMULTIPLIEDDSTCOLOR); }
    /** Unsafe version of {@link #advancedBlendCorrelatedOverlap}. */
    public static int nadvancedBlendCorrelatedOverlap(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.ADVANCEDBLENDCORRELATEDOVERLAP); }
    /** Unsafe version of {@link #advancedBlendAllOperations}. */
    public static int nadvancedBlendAllOperations(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.ADVANCEDBLENDALLOPERATIONS); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT, Buffer> {

        /**
         * Creates a new {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT newInstance(long address) {
            return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.npNext(address()); }
        /** Returns the value of the {@code advancedBlendMaxColorAttachments} field. */
        @NativeType("uint32_t")
        public int advancedBlendMaxColorAttachments() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendMaxColorAttachments(address()); }
        /** Returns the value of the {@code advancedBlendIndependentBlend} field. */
        @NativeType("VkBool32")
        public boolean advancedBlendIndependentBlend() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendIndependentBlend(address()) != 0; }
        /** Returns the value of the {@code advancedBlendNonPremultipliedSrcColor} field. */
        @NativeType("VkBool32")
        public boolean advancedBlendNonPremultipliedSrcColor() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendNonPremultipliedSrcColor(address()) != 0; }
        /** Returns the value of the {@code advancedBlendNonPremultipliedDstColor} field. */
        @NativeType("VkBool32")
        public boolean advancedBlendNonPremultipliedDstColor() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendNonPremultipliedDstColor(address()) != 0; }
        /** Returns the value of the {@code advancedBlendCorrelatedOverlap} field. */
        @NativeType("VkBool32")
        public boolean advancedBlendCorrelatedOverlap() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendCorrelatedOverlap(address()) != 0; }
        /** Returns the value of the {@code advancedBlendAllOperations} field. */
        @NativeType("VkBool32")
        public boolean advancedBlendAllOperations() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendAllOperations(address()) != 0; }

    }

}