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
 * Specify validation checks to disable for a Vulkan instance.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTValidationFlags#VK_STRUCTURE_TYPE_VALIDATION_FLAGS_EXT STRUCTURE_TYPE_VALIDATION_FLAGS_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pDisabledValidationChecks} <b>must</b> be a pointer to an array of {@code disabledValidationCheckCount} {@code VkValidationCheckEXT} values</li>
 * <li>{@code disabledValidationCheckCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code disabledValidationCheckCount} &ndash; the number of checks to disable.</li>
 * <li>{@code pDisabledValidationChecks} &ndash; a pointer to an array of values specifying the validation checks to be disabled. Checks which <b>may</b> be specified include:
 * 
 * <pre><code>typedef enum VkValidationCheckEXT {
    VK_VALIDATION_CHECK_ALL_EXT = 0,
} VkValidationCheckEXT;</code></pre>
 * 
 * <ul>
 * <li>{@link EXTValidationFlags#VK_VALIDATION_CHECK_ALL_EXT VALIDATION_CHECK_ALL_EXT} disables all validation checks.</li>
 * </ul></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkValidationFlagsEXT {
    VkStructureType sType;
    const void * pNext;
    uint32_t disabledValidationCheckCount;
    VkValidationCheckEXT * pDisabledValidationChecks;
}</code></pre>
 */
public class VkValidationFlagsEXT extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		DISABLEDVALIDATIONCHECKCOUNT,
		PDISABLEDVALIDATIONCHECKS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		DISABLEDVALIDATIONCHECKCOUNT = layout.offsetof(2);
		PDISABLEDVALIDATIONCHECKS = layout.offsetof(3);
	}

	VkValidationFlagsEXT(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkValidationFlagsEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkValidationFlagsEXT(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code disabledValidationCheckCount} field. */
	public int disabledValidationCheckCount() { return ndisabledValidationCheckCount(address()); }
	/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDisabledValidationChecks} field. */
	public IntBuffer pDisabledValidationChecks() { return npDisabledValidationChecks(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkValidationFlagsEXT sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkValidationFlagsEXT pNext(long value) { npNext(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pDisabledValidationChecks} field. */
	public VkValidationFlagsEXT pDisabledValidationChecks(IntBuffer value) { npDisabledValidationChecks(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkValidationFlagsEXT set(
		int sType,
		long pNext,
		IntBuffer pDisabledValidationChecks
	) {
		sType(sType);
		pNext(pNext);
		pDisabledValidationChecks(pDisabledValidationChecks);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkValidationFlagsEXT set(VkValidationFlagsEXT src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkValidationFlagsEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkValidationFlagsEXT malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkValidationFlagsEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkValidationFlagsEXT calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkValidationFlagsEXT} instance allocated with {@link BufferUtils}. */
	public static VkValidationFlagsEXT create() {
		return new VkValidationFlagsEXT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkValidationFlagsEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkValidationFlagsEXT create(long address) {
		return address == NULL ? null : new VkValidationFlagsEXT(address, null);
	}

	/**
	 * Returns a new {@link VkValidationFlagsEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkValidationFlagsEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkValidationFlagsEXT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkValidationFlagsEXT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkValidationFlagsEXT} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkValidationFlagsEXT mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkValidationFlagsEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkValidationFlagsEXT callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkValidationFlagsEXT} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkValidationFlagsEXT mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkValidationFlagsEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkValidationFlagsEXT callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkValidationFlagsEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkValidationFlagsEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkValidationFlagsEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkValidationFlagsEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkValidationFlagsEXT.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkValidationFlagsEXT.PNEXT); }
	/** Unsafe version of {@link #disabledValidationCheckCount}. */
	public static int ndisabledValidationCheckCount(long struct) { return memGetInt(struct + VkValidationFlagsEXT.DISABLEDVALIDATIONCHECKCOUNT); }
	/** Unsafe version of {@link #pDisabledValidationChecks() pDisabledValidationChecks}. */
	public static IntBuffer npDisabledValidationChecks(long struct) { return memIntBuffer(memGetAddress(struct + VkValidationFlagsEXT.PDISABLEDVALIDATIONCHECKS), ndisabledValidationCheckCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkValidationFlagsEXT.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkValidationFlagsEXT.PNEXT, value); }
	/** Sets the specified value to the {@code disabledValidationCheckCount} field of the specified {@code struct}. */
	public static void ndisabledValidationCheckCount(long struct, int value) { memPutInt(struct + VkValidationFlagsEXT.DISABLEDVALIDATIONCHECKCOUNT, value); }
	/** Unsafe version of {@link #pDisabledValidationChecks(IntBuffer) pDisabledValidationChecks}. */
	public static void npDisabledValidationChecks(long struct, IntBuffer value) { memPutAddress(struct + VkValidationFlagsEXT.PDISABLEDVALIDATIONCHECKS, memAddress(value)); ndisabledValidationCheckCount(struct, value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		check(memGetAddress(struct + VkValidationFlagsEXT.PDISABLEDVALIDATIONCHECKS));
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

	/** An array of {@link VkValidationFlagsEXT} structs. */
	public static class Buffer extends StructBuffer<VkValidationFlagsEXT, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkValidationFlagsEXT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkValidationFlagsEXT#SIZEOF}, and its mark will be undefined.
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
		protected VkValidationFlagsEXT newInstance(long address) {
			return new VkValidationFlagsEXT(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkValidationFlagsEXT.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkValidationFlagsEXT.npNext(address()); }
		/** Returns the value of the {@code disabledValidationCheckCount} field. */
		public int disabledValidationCheckCount() { return VkValidationFlagsEXT.ndisabledValidationCheckCount(address()); }
		/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDisabledValidationChecks} field. */
		public IntBuffer pDisabledValidationChecks() { return VkValidationFlagsEXT.npDisabledValidationChecks(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkValidationFlagsEXT.Buffer sType(int value) { VkValidationFlagsEXT.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkValidationFlagsEXT.Buffer pNext(long value) { VkValidationFlagsEXT.npNext(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pDisabledValidationChecks} field. */
		public VkValidationFlagsEXT.Buffer pDisabledValidationChecks(IntBuffer value) { VkValidationFlagsEXT.npDisabledValidationChecks(address(), value); return this; }

	}

}