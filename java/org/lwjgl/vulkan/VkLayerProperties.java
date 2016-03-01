/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkLayerProperties {
    char[256] layerName;
    uint32_t specVersion;
    uint32_t implementationVersion;
    char[256] description;
}</code></pre>
 */
public class VkLayerProperties extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		LAYERNAME,
		SPECVERSION,
		IMPLEMENTATIONVERSION,
		DESCRIPTION;

	static {
		Layout layout = __struct(
			__array(1, 256),
			__member(4),
			__member(4),
			__array(1, 256)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		LAYERNAME = layout.offsetof(0);
		SPECVERSION = layout.offsetof(1);
		IMPLEMENTATIONVERSION = layout.offsetof(2);
		DESCRIPTION = layout.offsetof(3);
	}

	VkLayerProperties(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkLayerProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkLayerProperties(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link ByteBuffer} view of the {@code layerName} field. */
	public ByteBuffer layerName() { return nlayerName(address()); }
	/** Decodes the null-terminated string stored in the {@code layerName} field. */
	public String layerNameString() { return nlayerNameString(address()); }
	/** Returns the value of the {@code specVersion} field. */
	public int specVersion() { return nspecVersion(address()); }
	/** Returns the value of the {@code implementationVersion} field. */
	public int implementationVersion() { return nimplementationVersion(address()); }
	/** Returns a {@link ByteBuffer} view of the {@code description} field. */
	public ByteBuffer description() { return ndescription(address()); }
	/** Decodes the null-terminated string stored in the {@code description} field. */
	public String descriptionString() { return ndescriptionString(address()); }

	// -----------------------------------

	/** Returns a new {@link VkLayerProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkLayerProperties malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkLayerProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkLayerProperties calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkLayerProperties} instance allocated with {@link BufferUtils}. */
	public static VkLayerProperties create() {
		return new VkLayerProperties(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkLayerProperties} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkLayerProperties create(long address) {
		return address == NULL ? null : new VkLayerProperties(address, null);
	}

	/**
	 * Returns a new {@link VkLayerProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkLayerProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkLayerProperties.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkLayerProperties.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #layerName}. */
	public static ByteBuffer nlayerName(long struct) { return memByteBuffer(struct + VkLayerProperties.LAYERNAME, 256); }
	/** Unsafe version of {@link #layerNameString}. */
	public static String nlayerNameString(long struct) { return memDecodeUTF8(struct + VkLayerProperties.LAYERNAME); }
	/** Unsafe version of {@link #specVersion}. */
	public static int nspecVersion(long struct) { return memGetInt(struct + VkLayerProperties.SPECVERSION); }
	/** Unsafe version of {@link #implementationVersion}. */
	public static int nimplementationVersion(long struct) { return memGetInt(struct + VkLayerProperties.IMPLEMENTATIONVERSION); }
	/** Unsafe version of {@link #description}. */
	public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkLayerProperties.DESCRIPTION, 256); }
	/** Unsafe version of {@link #descriptionString}. */
	public static String ndescriptionString(long struct) { return memDecodeUTF8(struct + VkLayerProperties.DESCRIPTION); }

	// -----------------------------------

	/** An array of {@link VkLayerProperties} structs. */
	public static final class Buffer extends StructBuffer<VkLayerProperties, Buffer> {

		/**
		 * Creates a new {@link VkLayerProperties.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkLayerProperties#SIZEOF}, and its mark will be undefined.
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
		protected VkLayerProperties newInstance(long address) {
			return new VkLayerProperties(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link ByteBuffer} view of the {@code layerName} field. */
		public ByteBuffer layerName() { return VkLayerProperties.nlayerName(address()); }
		/** Decodes the null-terminated string stored in the {@code layerName} field. */
		public String layerNameString() { return VkLayerProperties.nlayerNameString(address()); }
		/** Returns the value of the {@code specVersion} field. */
		public int specVersion() { return VkLayerProperties.nspecVersion(address()); }
		/** Returns the value of the {@code implementationVersion} field. */
		public int implementationVersion() { return VkLayerProperties.nimplementationVersion(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code description} field. */
		public ByteBuffer description() { return VkLayerProperties.ndescription(address()); }
		/** Decodes the null-terminated string stored in the {@code description} field. */
		public String descriptionString() { return VkLayerProperties.ndescriptionString(address()); }

	}

}