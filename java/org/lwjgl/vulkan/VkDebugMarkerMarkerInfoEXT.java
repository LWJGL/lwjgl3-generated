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
import static org.lwjgl.system.MemoryStack.*;

/**
 * Passed to {@link EXTDebugMarker#vkCmdDebugMarkerBeginEXT CmdDebugMarkerBeginEXT} and {@link EXTDebugMarker#vkCmdDebugMarkerInsertEXT CmdDebugMarkerInsertEXT}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link EXTDebugMarker#VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code pMarkerName} &ndash; a pointer to a null-terminated UTF-8 string that contains the name of the marker</li>
 * <li>{@code color} &ndash; 
 * an optional RGBA color value that can be associated with the marker. A particular implementation <b>may</b> choose to ignore this color value. The values
 * contain RGBA values in order, in the range 0.0 to 1.0. If all elements in {@code color} are set to 0.0 then it is ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDebugMarkerMarkerInfoEXT {
    VkStructureType sType;
    const void * pNext;
    const char * pMarkerName;
    float[4] color;
}</code></pre>
 */
public class VkDebugMarkerMarkerInfoEXT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		PMARKERNAME,
		COLOR;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__array(4, 4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		PMARKERNAME = layout.offsetof(2);
		COLOR = layout.offsetof(3);
	}

	VkDebugMarkerMarkerInfoEXT(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDebugMarkerMarkerInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDebugMarkerMarkerInfoEXT(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pMarkerName} field. */
	public ByteBuffer pMarkerName() { return npMarkerName(address()); }
	/** Decodes the null-terminated string pointed to by the {@code pMarkerName} field. */
	public String pMarkerNameString() { return npMarkerNameString(address()); }
	/** Returns a {@link FloatBuffer} view of the {@code color} field. */
	public FloatBuffer color() { return ncolor(address()); }
	/** Returns the value at the specified index of the {@code color} field. */
	public float color(int index) { return ncolor(address(), index); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDebugMarkerMarkerInfoEXT sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDebugMarkerMarkerInfoEXT pNext(long value) { npNext(address(), value); return this; }
	/** Sets the address of the specified encoded string to the {@code pMarkerName} field. */
	public VkDebugMarkerMarkerInfoEXT pMarkerName(ByteBuffer value) { npMarkerName(address(), value); return this; }
	/** Copies the specified {@link FloatBuffer} to the {@code color} field. */
	public VkDebugMarkerMarkerInfoEXT color(FloatBuffer value) { ncolor(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code color} field. */
	public VkDebugMarkerMarkerInfoEXT color(int index, float value) { ncolor(address(), index, value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDebugMarkerMarkerInfoEXT set(
		int sType,
		long pNext,
		ByteBuffer pMarkerName,
		FloatBuffer color
	) {
		sType(sType);
		pNext(pNext);
		pMarkerName(pMarkerName);
		color(color);

		return this;
	}

	/** Unsafe version of {@link #set(VkDebugMarkerMarkerInfoEXT) set}. */
	public VkDebugMarkerMarkerInfoEXT nset(long struct) {
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
	public VkDebugMarkerMarkerInfoEXT set(VkDebugMarkerMarkerInfoEXT src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDebugMarkerMarkerInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDebugMarkerMarkerInfoEXT malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDebugMarkerMarkerInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDebugMarkerMarkerInfoEXT calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDebugMarkerMarkerInfoEXT} instance allocated with {@link BufferUtils}. */
	public static VkDebugMarkerMarkerInfoEXT create() {
		return new VkDebugMarkerMarkerInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDebugMarkerMarkerInfoEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDebugMarkerMarkerInfoEXT create(long address) {
		return address == NULL ? null : new VkDebugMarkerMarkerInfoEXT(address, null);
	}

	/**
	 * Returns a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDebugMarkerMarkerInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDebugMarkerMarkerInfoEXT mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDebugMarkerMarkerInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDebugMarkerMarkerInfoEXT callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDebugMarkerMarkerInfoEXT} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDebugMarkerMarkerInfoEXT mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDebugMarkerMarkerInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDebugMarkerMarkerInfoEXT callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDebugMarkerMarkerInfoEXT.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDebugMarkerMarkerInfoEXT.PNEXT); }
	/** Unsafe version of {@link #pMarkerName}. */
	public static ByteBuffer npMarkerName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkDebugMarkerMarkerInfoEXT.PMARKERNAME)); }
	/** Unsafe version of {@link #pMarkerNameString}. */
	public static String npMarkerNameString(long struct) { return memUTF8(memGetAddress(struct + VkDebugMarkerMarkerInfoEXT.PMARKERNAME)); }
	/** Unsafe version of {@link #color}. */
	public static FloatBuffer ncolor(long struct) {
		return memFloatBuffer(struct + VkDebugMarkerMarkerInfoEXT.COLOR, 4);
	}
	/** Unsafe version of {@link #color(int) color}. */
	public static float ncolor(long struct, int index) { return memGetFloat(struct + VkDebugMarkerMarkerInfoEXT.COLOR + index * 4); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDebugMarkerMarkerInfoEXT.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugMarkerMarkerInfoEXT.PNEXT, value); }
	/** Unsafe version of {@link #pMarkerName(ByteBuffer) pMarkerName}. */
	public static void npMarkerName(long struct, ByteBuffer value) { 
		if ( CHECKS && value != null ) checkNT1(value); 
		memPutAddress(struct + VkDebugMarkerMarkerInfoEXT.PMARKERNAME, memAddress(value));
	}
	/** Unsafe version of {@link #color(FloatBuffer) color}. */
	public static void ncolor(long struct, FloatBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 4);
		memCopy(memAddress(value), struct + VkDebugMarkerMarkerInfoEXT.COLOR, value.remaining() * 4);
	}
	/** Unsafe version of {@link #color(int, float) color}. */
	public static void ncolor(long struct, int index, float value) { memPutFloat(struct + VkDebugMarkerMarkerInfoEXT.COLOR + index * 4, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkDebugMarkerMarkerInfoEXT.PMARKERNAME));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link VkDebugMarkerMarkerInfoEXT} structs. */
	public static final class Buffer extends StructBuffer<VkDebugMarkerMarkerInfoEXT, Buffer> {

		/**
		 * Creates a new {@link VkDebugMarkerMarkerInfoEXT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDebugMarkerMarkerInfoEXT#SIZEOF}, and its mark will be undefined.
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
		protected VkDebugMarkerMarkerInfoEXT newInstance(long address) {
			return new VkDebugMarkerMarkerInfoEXT(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDebugMarkerMarkerInfoEXT.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDebugMarkerMarkerInfoEXT.npNext(address()); }
		/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pMarkerName} field. */
		public ByteBuffer pMarkerName() { return VkDebugMarkerMarkerInfoEXT.npMarkerName(address()); }
		/** Decodes the null-terminated string pointed to by the {@code pMarkerName} field. */
		public String pMarkerNameString() { return VkDebugMarkerMarkerInfoEXT.npMarkerNameString(address()); }
		/** Returns a {@link FloatBuffer} view of the {@code color} field. */
		public FloatBuffer color() { return VkDebugMarkerMarkerInfoEXT.ncolor(address()); }
		/** Returns the value at the specified index of the {@code color} field. */
		public float color(int index) { return VkDebugMarkerMarkerInfoEXT.ncolor(address(), index); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDebugMarkerMarkerInfoEXT.Buffer sType(int value) { VkDebugMarkerMarkerInfoEXT.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDebugMarkerMarkerInfoEXT.Buffer pNext(long value) { VkDebugMarkerMarkerInfoEXT.npNext(address(), value); return this; }
		/** Sets the address of the specified encoded string to the {@code pMarkerName} field. */
		public VkDebugMarkerMarkerInfoEXT.Buffer pMarkerName(ByteBuffer value) { VkDebugMarkerMarkerInfoEXT.npMarkerName(address(), value); return this; }
		/** Copies the specified {@link FloatBuffer} to the {@code color} field. */
		public VkDebugMarkerMarkerInfoEXT.Buffer color(FloatBuffer value) { VkDebugMarkerMarkerInfoEXT.ncolor(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code color} field. */
		public VkDebugMarkerMarkerInfoEXT.Buffer color(int index, float value) { VkDebugMarkerMarkerInfoEXT.ncolor(address(), index, value); return this; }

	}

}