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
 * Structure specifying physical device sparse memory properties.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code residencyStandard2DBlockShape} &ndash; {@link VK10#VK_TRUE TRUE} if the physical device will access all single-sample 2D sparse resources using the standard sparse image block shapes (based on image format), as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#sparsememory-sparseblockshapessingle">Standard Sparse Image Block Shapes (Single Sample)</a> table. If this property is not supported the value returned in the {@code imageGranularity} member of the {@link VkSparseImageFormatProperties} structure for single-sample 2D images is not required: to match the standard sparse image block dimensions listed in the table.</li>
 * <li>{@code residencyStandard2DMultisampleBlockShape} &ndash; {@link VK10#VK_TRUE TRUE} if the physical device will access all multisample 2D sparse resources using the standard sparse image block shapes (based on image format), as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#sparsememory-sparseblockshapesmsaa">Standard Sparse Image Block Shapes (MSAA)</a> table. If this property is not supported, the value returned in the {@code imageGranularity} member of the {@link VkSparseImageFormatProperties} structure for multisample 2D images is not required: to match the standard sparse image block dimensions listed in the table.</li>
 * <li>{@code residencyStandard3DBlockShape} &ndash; {@link VK10#VK_TRUE TRUE} if the physical device will access all 3D sparse resources using the standard sparse image block shapes (based on image format), as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#sparsememory-sparseblockshapessingle">Standard Sparse Image Block Shapes (Single Sample)</a> table. If this property is not supported, the value returned in the {@code imageGranularity} member of the {@link VkSparseImageFormatProperties} structure for 3D images is not required: to match the standard sparse image block dimensions listed in the table.</li>
 * <li>{@code residencyAlignedMipSize} &ndash; {@link VK10#VK_TRUE TRUE} if images with mip level dimensions that are not integer multiples of the corresponding dimensions of the sparse image block <b>may</b> be placed in the mip tail. If this property is not reported, only mip levels with dimensions smaller than the {@code imageGranularity} member of the {@link VkSparseImageFormatProperties} structure will be placed in the mip tail. If this property is reported the implementation is allowed to return {@link VK10#VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT} in the {@code flags} member of {@link VkSparseImageFormatProperties}, indicating that mip level dimensions that are not integer multiples of the corresponding dimensions of the sparse image block will be placed in the mip tail.</li>
 * <li>{@code residencyNonResidentStrict} &ndash; specifies whether the physical device <b>can</b> consistently access non-resident regions of a resource. If this property is {@link VK10#VK_TRUE TRUE}, access to non-resident regions of resources will be guaranteed to return values as if the resource were populated with 0; writes to non-resident regions will be discarded.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceSparseProperties {
 *     VkBool32 residencyStandard2DBlockShape;
 *     VkBool32 residencyStandard2DMultisampleBlockShape;
 *     VkBool32 residencyStandard3DBlockShape;
 *     VkBool32 residencyAlignedMipSize;
 *     VkBool32 residencyNonResidentStrict;
 * }</pre></code>
 */
public class VkPhysicalDeviceSparseProperties extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESIDENCYSTANDARD2DBLOCKSHAPE,
        RESIDENCYSTANDARD2DMULTISAMPLEBLOCKSHAPE,
        RESIDENCYSTANDARD3DBLOCKSHAPE,
        RESIDENCYALIGNEDMIPSIZE,
        RESIDENCYNONRESIDENTSTRICT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESIDENCYSTANDARD2DBLOCKSHAPE = layout.offsetof(0);
        RESIDENCYSTANDARD2DMULTISAMPLEBLOCKSHAPE = layout.offsetof(1);
        RESIDENCYSTANDARD3DBLOCKSHAPE = layout.offsetof(2);
        RESIDENCYALIGNEDMIPSIZE = layout.offsetof(3);
        RESIDENCYNONRESIDENTSTRICT = layout.offsetof(4);
    }

    VkPhysicalDeviceSparseProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceSparseProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSparseProperties(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code residencyStandard2DBlockShape} field. */
    @NativeType("VkBool32")
    public boolean residencyStandard2DBlockShape() { return nresidencyStandard2DBlockShape(address()) != 0; }
    /** Returns the value of the {@code residencyStandard2DMultisampleBlockShape} field. */
    @NativeType("VkBool32")
    public boolean residencyStandard2DMultisampleBlockShape() { return nresidencyStandard2DMultisampleBlockShape(address()) != 0; }
    /** Returns the value of the {@code residencyStandard3DBlockShape} field. */
    @NativeType("VkBool32")
    public boolean residencyStandard3DBlockShape() { return nresidencyStandard3DBlockShape(address()) != 0; }
    /** Returns the value of the {@code residencyAlignedMipSize} field. */
    @NativeType("VkBool32")
    public boolean residencyAlignedMipSize() { return nresidencyAlignedMipSize(address()) != 0; }
    /** Returns the value of the {@code residencyNonResidentStrict} field. */
    @NativeType("VkBool32")
    public boolean residencyNonResidentStrict() { return nresidencyNonResidentStrict(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceSparseProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceSparseProperties create(long address) {
        return new VkPhysicalDeviceSparseProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSparseProperties createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkPhysicalDeviceSparseProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSparseProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #residencyStandard2DBlockShape}. */
    public static int nresidencyStandard2DBlockShape(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD2DBLOCKSHAPE); }
    /** Unsafe version of {@link #residencyStandard2DMultisampleBlockShape}. */
    public static int nresidencyStandard2DMultisampleBlockShape(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD2DMULTISAMPLEBLOCKSHAPE); }
    /** Unsafe version of {@link #residencyStandard3DBlockShape}. */
    public static int nresidencyStandard3DBlockShape(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD3DBLOCKSHAPE); }
    /** Unsafe version of {@link #residencyAlignedMipSize}. */
    public static int nresidencyAlignedMipSize(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYALIGNEDMIPSIZE); }
    /** Unsafe version of {@link #residencyNonResidentStrict}. */
    public static int nresidencyNonResidentStrict(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYNONRESIDENTSTRICT); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSparseProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSparseProperties, Buffer> {

        /**
         * Creates a new {@link VkPhysicalDeviceSparseProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSparseProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSparseProperties newInstance(long address) {
            return new VkPhysicalDeviceSparseProperties(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code residencyStandard2DBlockShape} field. */
        @NativeType("VkBool32")
        public boolean residencyStandard2DBlockShape() { return VkPhysicalDeviceSparseProperties.nresidencyStandard2DBlockShape(address()) != 0; }
        /** Returns the value of the {@code residencyStandard2DMultisampleBlockShape} field. */
        @NativeType("VkBool32")
        public boolean residencyStandard2DMultisampleBlockShape() { return VkPhysicalDeviceSparseProperties.nresidencyStandard2DMultisampleBlockShape(address()) != 0; }
        /** Returns the value of the {@code residencyStandard3DBlockShape} field. */
        @NativeType("VkBool32")
        public boolean residencyStandard3DBlockShape() { return VkPhysicalDeviceSparseProperties.nresidencyStandard3DBlockShape(address()) != 0; }
        /** Returns the value of the {@code residencyAlignedMipSize} field. */
        @NativeType("VkBool32")
        public boolean residencyAlignedMipSize() { return VkPhysicalDeviceSparseProperties.nresidencyAlignedMipSize(address()) != 0; }
        /** Returns the value of the {@code residencyNonResidentStrict} field. */
        @NativeType("VkBool32")
        public boolean residencyNonResidentStrict() { return VkPhysicalDeviceSparseProperties.nresidencyNonResidentStrict(address()) != 0; }

    }

}