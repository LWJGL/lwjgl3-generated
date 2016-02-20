/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct VkDisplayPropertiesKHR {
 *     VkDisplayKHR display;
 *     const char * displayName;
 *     {@link VkExtent2D VkExtent2D} physicalDimensions;
 *     {@link VkExtent2D VkExtent2D} physicalResolution;
 *     VkSurfaceTransformFlagsKHR supportedTransforms;
 *     VkBool32 planeReorderPossible;
 *     VkBool32 persistentContent;
 * }</code></pre>
 */
public class VkDisplayPropertiesKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		DISPLAY,
		DISPLAYNAME,
		PHYSICALDIMENSIONS,
		PHYSICALRESOLUTION,
		SUPPORTEDTRANSFORMS,
		PLANEREORDERPOSSIBLE,
		PERSISTENTCONTENT;

	static {
		Layout layout = __struct(
			__member(8),
			__member(POINTER_SIZE),
			__member(VkExtent2D.SIZEOF, VkExtent2D.__ALIGNMENT),
			__member(VkExtent2D.SIZEOF, VkExtent2D.__ALIGNMENT),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		DISPLAY = layout.offsetof(0);
		DISPLAYNAME = layout.offsetof(1);
		PHYSICALDIMENSIONS = layout.offsetof(2);
		PHYSICALRESOLUTION = layout.offsetof(3);
		SUPPORTEDTRANSFORMS = layout.offsetof(4);
		PLANEREORDERPOSSIBLE = layout.offsetof(5);
		PERSISTENTCONTENT = layout.offsetof(6);
	}

	VkDisplayPropertiesKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDisplayPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDisplayPropertiesKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code display} field. */
	public long display() { return ndisplay(address()); }
	/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code displayName} field. */
	public ByteBuffer displayName() { return ndisplayName(address()); }
	/** Decodes the null-terminated string pointed to by the {@code displayName} field. */
	public String displayNameString() { return ndisplayNameString(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code physicalDimensions} field. */
	public VkExtent2D physicalDimensions() { return nphysicalDimensions(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code physicalResolution} field. */
	public VkExtent2D physicalResolution() { return nphysicalResolution(address()); }
	/** Returns the value of the {@code supportedTransforms} field. */
	public int supportedTransforms() { return nsupportedTransforms(address()); }
	/** Returns the value of the {@code planeReorderPossible} field. */
	public int planeReorderPossible() { return nplaneReorderPossible(address()); }
	/** Returns the value of the {@code persistentContent} field. */
	public int persistentContent() { return npersistentContent(address()); }

	/** Sets the specified value to the {@code display} field. */
	public VkDisplayPropertiesKHR display(long value) { ndisplay(address(), value); return this; }
	/** Sets the address of the specified encoded string to the {@code displayName} field. */
	public VkDisplayPropertiesKHR displayName(ByteBuffer value) { ndisplayName(address(), value); return this; }
	/**
	 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code displayName} field.
	 *
	 * <p>The encoded string must be explicitly freed with {@link #displayNameFree}.</p>
	 */
	public VkDisplayPropertiesKHR displayName(CharSequence value) { ndisplayName(address(), value); return this; }
	/** Frees the string encoded by {@link #displayName(CharSequence)} and stored in the {@code displayName} field. */
	public VkDisplayPropertiesKHR displayNameFree() { ndisplayNameFree(address()); return this; }
	/** Copies the specified {@link VkExtent2D} to the {@code physicalDimensions} field. */
	public VkDisplayPropertiesKHR physicalDimensions(VkExtent2D value) { nphysicalDimensions(address(), value); return this; }
	/** Copies the specified {@link VkExtent2D} to the {@code physicalResolution} field. */
	public VkDisplayPropertiesKHR physicalResolution(VkExtent2D value) { nphysicalResolution(address(), value); return this; }
	/** Sets the specified value to the {@code supportedTransforms} field. */
	public VkDisplayPropertiesKHR supportedTransforms(int value) { nsupportedTransforms(address(), value); return this; }
	/** Sets the specified value to the {@code planeReorderPossible} field. */
	public VkDisplayPropertiesKHR planeReorderPossible(int value) { nplaneReorderPossible(address(), value); return this; }
	/** Sets the specified value to the {@code persistentContent} field. */
	public VkDisplayPropertiesKHR persistentContent(int value) { npersistentContent(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDisplayPropertiesKHR set(
		long display,
		ByteBuffer displayName,
		VkExtent2D physicalDimensions,
		VkExtent2D physicalResolution,
		int supportedTransforms,
		int planeReorderPossible,
		int persistentContent
	) {
		display(display);
		displayName(displayName);
		physicalDimensions(physicalDimensions);
		physicalResolution(physicalResolution);
		supportedTransforms(supportedTransforms);
		planeReorderPossible(planeReorderPossible);
		persistentContent(persistentContent);

		return this;
	}

	/** Unsafe version of {@link #set(VkDisplayPropertiesKHR) set}. */
	public VkDisplayPropertiesKHR nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkDisplayPropertiesKHR set(VkDisplayPropertiesKHR src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDisplayPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkDisplayPropertiesKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDisplayPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkDisplayPropertiesKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDisplayPropertiesKHR} instance allocated with {@link BufferUtils}. */
	public static VkDisplayPropertiesKHR create() {
		return new VkDisplayPropertiesKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDisplayPropertiesKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDisplayPropertiesKHR create(long address) {
		return address == NULL ? null : new VkDisplayPropertiesKHR(address, null);
	}

	/**
	 * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDisplayPropertiesKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #display}. */
	public static long ndisplay(long struct) { return memGetLong(struct + VkDisplayPropertiesKHR.DISPLAY); }
	/** Unsafe version of {@link #displayName}. */
	public static ByteBuffer ndisplayName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkDisplayPropertiesKHR.DISPLAYNAME)); }
	/** Unsafe version of {@link #displayNameString}. */
	public static String ndisplayNameString(long struct) { return memDecodeUTF8(memGetAddress(struct + VkDisplayPropertiesKHR.DISPLAYNAME)); }
	/** Unsafe version of {@link #physicalDimensions}. */
	public static VkExtent2D nphysicalDimensions(long struct) { return VkExtent2D.create(struct + VkDisplayPropertiesKHR.PHYSICALDIMENSIONS); }
	/** Unsafe version of {@link #physicalResolution}. */
	public static VkExtent2D nphysicalResolution(long struct) { return VkExtent2D.create(struct + VkDisplayPropertiesKHR.PHYSICALRESOLUTION); }
	/** Unsafe version of {@link #supportedTransforms}. */
	public static int nsupportedTransforms(long struct) { return memGetInt(struct + VkDisplayPropertiesKHR.SUPPORTEDTRANSFORMS); }
	/** Unsafe version of {@link #planeReorderPossible}. */
	public static int nplaneReorderPossible(long struct) { return memGetInt(struct + VkDisplayPropertiesKHR.PLANEREORDERPOSSIBLE); }
	/** Unsafe version of {@link #persistentContent}. */
	public static int npersistentContent(long struct) { return memGetInt(struct + VkDisplayPropertiesKHR.PERSISTENTCONTENT); }

	/** Unsafe version of {@link #display(long) display}. */
	public static void ndisplay(long struct, long value) { memPutLong(struct + VkDisplayPropertiesKHR.DISPLAY, value); }
	/** Unsafe version of {@link #displayName(ByteBuffer) displayName}. */
	public static void ndisplayName(long struct, ByteBuffer value) { 
		if ( CHECKS && value != null ) checkNT1(value); 
		memPutAddress(struct + VkDisplayPropertiesKHR.DISPLAYNAME, memAddressSafe(value));
	}
	/** Unsafe version of {@link #displayName(CharSequence) displayName}. */
	public static void ndisplayName(long struct, CharSequence value) { ndisplayName(struct, memEncodeUTF8(value, BufferAllocator.MALLOC)); }
	/** Unsafe version of {@link #displayNameFree}. */
	public static void ndisplayNameFree(long struct) { nmemFree(memGetAddress(struct + VkDisplayPropertiesKHR.DISPLAYNAME)); }
	/** Unsafe version of {@link #physicalDimensions(VkExtent2D) physicalDimensions}. */
	public static void nphysicalDimensions(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkDisplayPropertiesKHR.PHYSICALDIMENSIONS, VkExtent2D.SIZEOF); }
	/** Unsafe version of {@link #physicalResolution(VkExtent2D) physicalResolution}. */
	public static void nphysicalResolution(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkDisplayPropertiesKHR.PHYSICALRESOLUTION, VkExtent2D.SIZEOF); }
	/** Unsafe version of {@link #supportedTransforms(int) supportedTransforms}. */
	public static void nsupportedTransforms(long struct, int value) { memPutInt(struct + VkDisplayPropertiesKHR.SUPPORTEDTRANSFORMS, value); }
	/** Unsafe version of {@link #planeReorderPossible(int) planeReorderPossible}. */
	public static void nplaneReorderPossible(long struct, int value) { memPutInt(struct + VkDisplayPropertiesKHR.PLANEREORDERPOSSIBLE, value); }
	/** Unsafe version of {@link #persistentContent(int) persistentContent}. */
	public static void npersistentContent(long struct, int value) { memPutInt(struct + VkDisplayPropertiesKHR.PERSISTENTCONTENT, value); }

	// -----------------------------------

	/** An array of {@link VkDisplayPropertiesKHR} structs. */
	public static final class Buffer extends StructBuffer<VkDisplayPropertiesKHR, Buffer> {

		/**
		 * Creates a new {@link VkDisplayPropertiesKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDisplayPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkDisplayPropertiesKHR newInstance(long address) {
			return new VkDisplayPropertiesKHR(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code display} field. */
		public long display() { return VkDisplayPropertiesKHR.ndisplay(address()); }
		/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code displayName} field. */
		public ByteBuffer displayName() { return VkDisplayPropertiesKHR.ndisplayName(address()); }
		/** Decodes the null-terminated string pointed to by the {@code displayName} field. */
		public String displayNameString() { return VkDisplayPropertiesKHR.ndisplayNameString(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code physicalDimensions} field. */
		public VkExtent2D physicalDimensions() { return VkDisplayPropertiesKHR.nphysicalDimensions(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code physicalResolution} field. */
		public VkExtent2D physicalResolution() { return VkDisplayPropertiesKHR.nphysicalResolution(address()); }
		/** Returns the value of the {@code supportedTransforms} field. */
		public int supportedTransforms() { return VkDisplayPropertiesKHR.nsupportedTransforms(address()); }
		/** Returns the value of the {@code planeReorderPossible} field. */
		public int planeReorderPossible() { return VkDisplayPropertiesKHR.nplaneReorderPossible(address()); }
		/** Returns the value of the {@code persistentContent} field. */
		public int persistentContent() { return VkDisplayPropertiesKHR.npersistentContent(address()); }

		/** Sets the specified value to the {@code display} field. */
		public VkDisplayPropertiesKHR.Buffer display(long value) { VkDisplayPropertiesKHR.ndisplay(address(), value); return this; }
		/** Sets the address of the specified encoded string to the {@code displayName} field. */
		public VkDisplayPropertiesKHR.Buffer displayName(ByteBuffer value) { VkDisplayPropertiesKHR.ndisplayName(address(), value); return this; }
		/**
		 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code displayName} field.
		 *
		 * <p>The encoded string must be explicitly freed with {@link #displayNameFree}.</p>
		 */
		public VkDisplayPropertiesKHR.Buffer displayName(CharSequence value) { VkDisplayPropertiesKHR.ndisplayName(address(), value); return this; }
		/** Frees the string encoded by {@link #displayName(CharSequence)} and stored in the {@code displayName} field. */
		public VkDisplayPropertiesKHR.Buffer displayNameFree() { VkDisplayPropertiesKHR.ndisplayNameFree(address()); return this; }
		/** Copies the specified {@link VkExtent2D} to the {@code physicalDimensions} field. */
		public VkDisplayPropertiesKHR.Buffer physicalDimensions(VkExtent2D value) { VkDisplayPropertiesKHR.nphysicalDimensions(address(), value); return this; }
		/** Copies the specified {@link VkExtent2D} to the {@code physicalResolution} field. */
		public VkDisplayPropertiesKHR.Buffer physicalResolution(VkExtent2D value) { VkDisplayPropertiesKHR.nphysicalResolution(address(), value); return this; }
		/** Sets the specified value to the {@code supportedTransforms} field. */
		public VkDisplayPropertiesKHR.Buffer supportedTransforms(int value) { VkDisplayPropertiesKHR.nsupportedTransforms(address(), value); return this; }
		/** Sets the specified value to the {@code planeReorderPossible} field. */
		public VkDisplayPropertiesKHR.Buffer planeReorderPossible(int value) { VkDisplayPropertiesKHR.nplaneReorderPossible(address(), value); return this; }
		/** Sets the specified value to the {@code persistentContent} field. */
		public VkDisplayPropertiesKHR.Buffer persistentContent(int value) { VkDisplayPropertiesKHR.npersistentContent(address(), value); return this; }

	}

}