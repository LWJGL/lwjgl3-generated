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
 * Structure specifying external memory handle type capabilities.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code compatibleHandleTypes} <b>must</b> include at least {@code handleType}. Inclusion of a handle type in {@code compatibleHandleTypes} does not imply the values returned in {@link VkImageFormatProperties2KHR} will be the same when {@link VkPhysicalDeviceExternalImageFormatInfoKHR}{@code ::handleType} is set to that type. The application is responsible for querying the capabilities of all handle types intended for concurrent use in a single image and intersecting them to obtain the compatible set of capabilities.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExternalBufferPropertiesKHR}, {@link VkExternalImageFormatPropertiesKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code externalMemoryFeatures} &ndash; a bitmask of {@code VkExternalMemoryFeatureFlagBitsKHR} specifying the features of {@code handleType}.</li>
 * <li>{@code exportFromImportedHandleTypes} &ndash; a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsKHR} specifying which types of imported handle {@code handleType} <b>can</b> be exported from.</li>
 * <li>{@code compatibleHandleTypes} &ndash; a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsKHR} specifying handle types which <b>can</b> be specified at the same time as {@code handleType} when creating an image compatible with external memory.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkExternalMemoryPropertiesKHR {
 *     VkExternalMemoryFeatureFlagsKHR externalMemoryFeatures;
 *     VkExternalMemoryHandleTypeFlagsKHR exportFromImportedHandleTypes;
 *     VkExternalMemoryHandleTypeFlagsKHR compatibleHandleTypes;
 * }</pre></code>
 */
public class VkExternalMemoryPropertiesKHR extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EXTERNALMEMORYFEATURES,
        EXPORTFROMIMPORTEDHANDLETYPES,
        COMPATIBLEHANDLETYPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EXTERNALMEMORYFEATURES = layout.offsetof(0);
        EXPORTFROMIMPORTEDHANDLETYPES = layout.offsetof(1);
        COMPATIBLEHANDLETYPES = layout.offsetof(2);
    }

    VkExternalMemoryPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkExternalMemoryPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalMemoryPropertiesKHR(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code externalMemoryFeatures} field. */
    public int externalMemoryFeatures() { return nexternalMemoryFeatures(address()); }
    /** Returns the value of the {@code exportFromImportedHandleTypes} field. */
    public int exportFromImportedHandleTypes() { return nexportFromImportedHandleTypes(address()); }
    /** Returns the value of the {@code compatibleHandleTypes} field. */
    public int compatibleHandleTypes() { return ncompatibleHandleTypes(address()); }

    // -----------------------------------

    /** Returns a new {@link VkExternalMemoryPropertiesKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkExternalMemoryPropertiesKHR create(long address) {
        return address == NULL ? null : new VkExternalMemoryPropertiesKHR(address, null);
    }

    /**
     * Create a {@link VkExternalMemoryPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #externalMemoryFeatures}. */
    public static int nexternalMemoryFeatures(long struct) { return memGetInt(struct + VkExternalMemoryPropertiesKHR.EXTERNALMEMORYFEATURES); }
    /** Unsafe version of {@link #exportFromImportedHandleTypes}. */
    public static int nexportFromImportedHandleTypes(long struct) { return memGetInt(struct + VkExternalMemoryPropertiesKHR.EXPORTFROMIMPORTEDHANDLETYPES); }
    /** Unsafe version of {@link #compatibleHandleTypes}. */
    public static int ncompatibleHandleTypes(long struct) { return memGetInt(struct + VkExternalMemoryPropertiesKHR.COMPATIBLEHANDLETYPES); }

    // -----------------------------------

    /** An array of {@link VkExternalMemoryPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkExternalMemoryPropertiesKHR, Buffer> {

        /**
         * Creates a new {@link VkExternalMemoryPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalMemoryPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkExternalMemoryPropertiesKHR newInstance(long address) {
            return new VkExternalMemoryPropertiesKHR(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code externalMemoryFeatures} field. */
        public int externalMemoryFeatures() { return VkExternalMemoryPropertiesKHR.nexternalMemoryFeatures(address()); }
        /** Returns the value of the {@code exportFromImportedHandleTypes} field. */
        public int exportFromImportedHandleTypes() { return VkExternalMemoryPropertiesKHR.nexportFromImportedHandleTypes(address()); }
        /** Returns the value of the {@code compatibleHandleTypes} field. */
        public int compatibleHandleTypes() { return VkExternalMemoryPropertiesKHR.ncompatibleHandleTypes(address()); }

    }

}