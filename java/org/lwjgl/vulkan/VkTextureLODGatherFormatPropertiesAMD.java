/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure informing whether or not texture gather bias/LOD functionality is supported for a given image format and a given physical device.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL}.</li>
 * <li>{@code supportsTextureGatherLODBiasAMD} &ndash; tells if the image format can be used with texture gather bias/LOD functions, as introduced by the {@link #AMD_texture_gather_bias_lod} extension. (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VK_AMD_texture_gather_bias_lod">VK_AMD_texture_gather_bias_lod</a>). This field is set by the implementation. User-specified value is ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkTextureLODGatherFormatPropertiesAMD {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 supportsTextureGatherLODBiasAMD;
 * }</pre></code>
 */
public class VkTextureLODGatherFormatPropertiesAMD extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUPPORTSTEXTUREGATHERLODBIASAMD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTSTEXTUREGATHERLODBIASAMD = layout.offsetof(2);
    }

    VkTextureLODGatherFormatPropertiesAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkTextureLODGatherFormatPropertiesAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTextureLODGatherFormatPropertiesAMD(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code supportsTextureGatherLODBiasAMD} field. */
    public boolean supportsTextureGatherLODBiasAMD() { return nsupportsTextureGatherLODBiasAMD(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@link VkTextureLODGatherFormatPropertiesAMD} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkTextureLODGatherFormatPropertiesAMD create(long address) {
        return address == NULL ? null : new VkTextureLODGatherFormatPropertiesAMD(address, null);
    }

    /**
     * Create a {@link VkTextureLODGatherFormatPropertiesAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTextureLODGatherFormatPropertiesAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTextureLODGatherFormatPropertiesAMD.PNEXT); }
    /** Unsafe version of {@link #supportsTextureGatherLODBiasAMD}. */
    public static int nsupportsTextureGatherLODBiasAMD(long struct) { return memGetInt(struct + VkTextureLODGatherFormatPropertiesAMD.SUPPORTSTEXTUREGATHERLODBIASAMD); }

    // -----------------------------------

    /** An array of {@link VkTextureLODGatherFormatPropertiesAMD} structs. */
    public static class Buffer extends StructBuffer<VkTextureLODGatherFormatPropertiesAMD, Buffer> {

        /**
         * Creates a new {@link VkTextureLODGatherFormatPropertiesAMD.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTextureLODGatherFormatPropertiesAMD#SIZEOF}, and its mark will be undefined.
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
        protected VkTextureLODGatherFormatPropertiesAMD newInstance(long address) {
            return new VkTextureLODGatherFormatPropertiesAMD(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkTextureLODGatherFormatPropertiesAMD.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkTextureLODGatherFormatPropertiesAMD.npNext(address()); }
        /** Returns the value of the {@code supportsTextureGatherLODBiasAMD} field. */
        public boolean supportsTextureGatherLODBiasAMD() { return VkTextureLODGatherFormatPropertiesAMD.nsupportsTextureGatherLODBiasAMD(address()) != 0; }

    }

}