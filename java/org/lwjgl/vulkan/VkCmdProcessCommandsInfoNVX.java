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
 * Structure specifying parameters for the generation of commands.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The provided {@code objectTable} <b>must</b> include all objects referenced by the generation process.</li>
 * <li>{@code indirectCommandsTokenCount} must match the {@code indirectCommandsLayout}&#8217;s tokenCount.</li>
 * <li>The {@code tokenType} member of each entry in the {@code pIndirectCommandsTokens} array must match the values used at creation time of {@code indirectCommandsLayout}</li>
 * <li>If {@code targetCommandBuffer} is provided, it must have reserved command space.</li>
 * <li>If {@code targetCommandBuffer} is provided, the {@code objectTable} <b>must</b> match the reservation&#8217;s objectTable and <b>must</b> have had all referenced objects registered at reservation time.</li>
 * <li>If {@code targetCommandBuffer} is provided, the {@code indirectCommandsLayout} <b>must</b> match the reservation&#8217;s indirectCommandsLayout.</li>
 * <li>If {@code targetCommandBuffer} is provided, the {@code maxSequencesCount} <b>must</b> not exceed the reservation&#8217;s maxSequencesCount.</li>
 * <li>If {@code sequencesCountBuffer} is used, its usage flag <b>must</b> have {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set.</li>
 * <li>If {@code sequencesCountBuffer} is used, {@code sequencesCountOffset} must be aligned to {@link VkDeviceGeneratedCommandsLimitsNVX}{@code ::minSequenceCountBufferOffsetAlignment}.</li>
 * <li>If {@code sequencesIndexBuffer} is used, its usage flag <b>must</b> have {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set.</li>
 * <li>If {@code sequencesIndexBuffer} is used, {@code sequencesIndexOffset} must be aligned to {@link VkDeviceGeneratedCommandsLimitsNVX}{@code ::minSequenceIndexBufferOffsetAlignment}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXDeviceGeneratedCommands#VK_STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code objectTable} <b>must</b> be a valid {@code VkObjectTableNVX} handle</li>
 * <li>{@code indirectCommandsLayout} <b>must</b> be a valid {@code VkIndirectCommandsLayoutNVX} handle</li>
 * <li>{@code pIndirectCommandsTokens} <b>must</b> be a pointer to an array of {@code tokenCount} valid {@link VkIndirectCommandsTokenNVX} structures</li>
 * <li>If {@code targetCommandBuffer} is not {@code NULL}, {@code targetCommandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
 * <li>If {@code sequencesCountBuffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code sequencesCountBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>If {@code sequencesIndexBuffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code sequencesIndexBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>Each of {@code indirectCommandsLayout}, {@code objectTable}, {@code sequencesCountBuffer}, {@code sequencesIndexBuffer}, and {@code targetCommandBuffer} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>Host Synchronization</h5>
 * 
 * <ul>
 * <li>Host access to {@code objectTable} <b>must</b> be externally synchronized</li>
 * <li>Host access to {@code targetCommandBuffer} <b>must</b> be externally synchronized</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkIndirectCommandsTokenNVX}, {@link NVXDeviceGeneratedCommands#vkCmdProcessCommandsNVX CmdProcessCommandsNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code objectTable} &ndash; the {@code VkObjectTableNVX} to be used for the generation process. Only registered objects at the time {@link NVXDeviceGeneratedCommands#vkCmdReserveSpaceForCommandsNVX CmdReserveSpaceForCommandsNVX} is called, will be taken into account for the reservation.</li>
 * <li>{@code indirectCommandsLayout} &ndash; the {@code VkIndirectCommandsLayoutNVX} that provides the command sequence to generate.</li>
 * <li>{@code indirectCommandsTokenCount} &ndash; defines the number of input tokens used.</li>
 * <li>{@code pIndirectCommandsTokens} &ndash; provides an array of {@link VkIndirectCommandsTokenNVX} that reference the input data for each token command.</li>
 * <li>{@code maxSequencesCount} &ndash; the maximum number of sequences for which command buffer space will be reserved. If {@code sequencesCountBuffer} is {@code NULL}, this is also the actual number of sequences generated.</li>
 * <li>{@code targetCommandBuffer} &ndash; <b>can</b> be the secondary {@code VkCommandBuffer} in which the commands should be recorded. If {@code NULL} an implicit reservation as well as execution takes place on the processing {@code VkCommandBuffer}.</li>
 * <li>{@code sequencesCountBuffer} &ndash; <b>can</b> be {@code VkBuffer} from which the actual amount of sequences is sourced from as ftext:uint32_t value.</li>
 * <li>{@code sequencesCountOffset} &ndash; the byte offset into {@code sequencesCountBuffer} where the count value is stored.</li>
 * <li>{@code sequencesIndexBuffer} &ndash; <b>must</b> be set if {@code indirectCommandsLayout}&#8217;s {@link NVXDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX} is set and provides the used sequence indices as ftext:uint32_t array. Otherwise it <b>must</b> be {@code NULL}.</li>
 * <li>{@code sequencesIndexOffset} &ndash; the byte offset into {@code sequencesIndexBuffer} where the index values start.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkCmdProcessCommandsInfoNVX {
    VkStructureType sType;
    const void * pNext;
    VkObjectTableNVX objectTable;
    VkIndirectCommandsLayoutNVX indirectCommandsLayout;
    uint32_t indirectCommandsTokenCount;
    const VkIndirectCommandsTokenNVX * pIndirectCommandsTokens;
    uint32_t maxSequencesCount;
    VkCommandBuffer targetCommandBuffer;
    VkBuffer sequencesCountBuffer;
    VkDeviceSize sequencesCountOffset;
    VkBuffer sequencesIndexBuffer;
    VkDeviceSize sequencesIndexOffset;
}</code></pre>
 */
public class VkCmdProcessCommandsInfoNVX extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		OBJECTTABLE,
		INDIRECTCOMMANDSLAYOUT,
		INDIRECTCOMMANDSTOKENCOUNT,
		PINDIRECTCOMMANDSTOKENS,
		MAXSEQUENCESCOUNT,
		TARGETCOMMANDBUFFER,
		SEQUENCESCOUNTBUFFER,
		SEQUENCESCOUNTOFFSET,
		SEQUENCESINDEXBUFFER,
		SEQUENCESINDEXOFFSET;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(8),
			__member(8),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(8),
			__member(8),
			__member(8),
			__member(8)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		OBJECTTABLE = layout.offsetof(2);
		INDIRECTCOMMANDSLAYOUT = layout.offsetof(3);
		INDIRECTCOMMANDSTOKENCOUNT = layout.offsetof(4);
		PINDIRECTCOMMANDSTOKENS = layout.offsetof(5);
		MAXSEQUENCESCOUNT = layout.offsetof(6);
		TARGETCOMMANDBUFFER = layout.offsetof(7);
		SEQUENCESCOUNTBUFFER = layout.offsetof(8);
		SEQUENCESCOUNTOFFSET = layout.offsetof(9);
		SEQUENCESINDEXBUFFER = layout.offsetof(10);
		SEQUENCESINDEXOFFSET = layout.offsetof(11);
	}

	VkCmdProcessCommandsInfoNVX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkCmdProcessCommandsInfoNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkCmdProcessCommandsInfoNVX(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code objectTable} field. */
	public long objectTable() { return nobjectTable(address()); }
	/** Returns the value of the {@code indirectCommandsLayout} field. */
	public long indirectCommandsLayout() { return nindirectCommandsLayout(address()); }
	/** Returns the value of the {@code indirectCommandsTokenCount} field. */
	public int indirectCommandsTokenCount() { return nindirectCommandsTokenCount(address()); }
	/**
	 * Returns a {@link VkIndirectCommandsTokenNVX.Buffer} view of the struct array pointed to by the {@code pIndirectCommandsTokens} field.
	 *
	 * @param capacity the number of elements in the returned buffer
	 */
	public VkIndirectCommandsTokenNVX.Buffer pIndirectCommandsTokens(int capacity) { return npIndirectCommandsTokens(address(), capacity); }
	/** Returns the value of the {@code maxSequencesCount} field. */
	public int maxSequencesCount() { return nmaxSequencesCount(address()); }
	/** Returns the value of the {@code targetCommandBuffer} field. */
	public long targetCommandBuffer() { return ntargetCommandBuffer(address()); }
	/** Returns the value of the {@code sequencesCountBuffer} field. */
	public long sequencesCountBuffer() { return nsequencesCountBuffer(address()); }
	/** Returns the value of the {@code sequencesCountOffset} field. */
	public long sequencesCountOffset() { return nsequencesCountOffset(address()); }
	/** Returns the value of the {@code sequencesIndexBuffer} field. */
	public long sequencesIndexBuffer() { return nsequencesIndexBuffer(address()); }
	/** Returns the value of the {@code sequencesIndexOffset} field. */
	public long sequencesIndexOffset() { return nsequencesIndexOffset(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkCmdProcessCommandsInfoNVX sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkCmdProcessCommandsInfoNVX pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code objectTable} field. */
	public VkCmdProcessCommandsInfoNVX objectTable(long value) { nobjectTable(address(), value); return this; }
	/** Sets the specified value to the {@code indirectCommandsLayout} field. */
	public VkCmdProcessCommandsInfoNVX indirectCommandsLayout(long value) { nindirectCommandsLayout(address(), value); return this; }
	/** Sets the specified value to the {@code indirectCommandsTokenCount} field. */
	public VkCmdProcessCommandsInfoNVX indirectCommandsTokenCount(int value) { nindirectCommandsTokenCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkIndirectCommandsTokenNVX.Buffer} to the {@code pIndirectCommandsTokens} field. */
	public VkCmdProcessCommandsInfoNVX pIndirectCommandsTokens(VkIndirectCommandsTokenNVX.Buffer value) { npIndirectCommandsTokens(address(), value); return this; }
	/** Sets the specified value to the {@code maxSequencesCount} field. */
	public VkCmdProcessCommandsInfoNVX maxSequencesCount(int value) { nmaxSequencesCount(address(), value); return this; }
	/** Sets the specified value to the {@code targetCommandBuffer} field. */
	public VkCmdProcessCommandsInfoNVX targetCommandBuffer(VkCommandBuffer value) { ntargetCommandBuffer(address(), value); return this; }
	/** Sets the specified value to the {@code sequencesCountBuffer} field. */
	public VkCmdProcessCommandsInfoNVX sequencesCountBuffer(long value) { nsequencesCountBuffer(address(), value); return this; }
	/** Sets the specified value to the {@code sequencesCountOffset} field. */
	public VkCmdProcessCommandsInfoNVX sequencesCountOffset(long value) { nsequencesCountOffset(address(), value); return this; }
	/** Sets the specified value to the {@code sequencesIndexBuffer} field. */
	public VkCmdProcessCommandsInfoNVX sequencesIndexBuffer(long value) { nsequencesIndexBuffer(address(), value); return this; }
	/** Sets the specified value to the {@code sequencesIndexOffset} field. */
	public VkCmdProcessCommandsInfoNVX sequencesIndexOffset(long value) { nsequencesIndexOffset(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkCmdProcessCommandsInfoNVX set(
		int sType,
		long pNext,
		long objectTable,
		long indirectCommandsLayout,
		int indirectCommandsTokenCount,
		VkIndirectCommandsTokenNVX.Buffer pIndirectCommandsTokens,
		int maxSequencesCount,
		VkCommandBuffer targetCommandBuffer,
		long sequencesCountBuffer,
		long sequencesCountOffset,
		long sequencesIndexBuffer,
		long sequencesIndexOffset
	) {
		sType(sType);
		pNext(pNext);
		objectTable(objectTable);
		indirectCommandsLayout(indirectCommandsLayout);
		indirectCommandsTokenCount(indirectCommandsTokenCount);
		pIndirectCommandsTokens(pIndirectCommandsTokens);
		maxSequencesCount(maxSequencesCount);
		targetCommandBuffer(targetCommandBuffer);
		sequencesCountBuffer(sequencesCountBuffer);
		sequencesCountOffset(sequencesCountOffset);
		sequencesIndexBuffer(sequencesIndexBuffer);
		sequencesIndexOffset(sequencesIndexOffset);

		return this;
	}

	/** Unsafe version of {@link #set(VkCmdProcessCommandsInfoNVX) set}. */
	public VkCmdProcessCommandsInfoNVX nset(long struct) {
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
	public VkCmdProcessCommandsInfoNVX set(VkCmdProcessCommandsInfoNVX src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkCmdProcessCommandsInfoNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkCmdProcessCommandsInfoNVX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkCmdProcessCommandsInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkCmdProcessCommandsInfoNVX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkCmdProcessCommandsInfoNVX} instance allocated with {@link BufferUtils}. */
	public static VkCmdProcessCommandsInfoNVX create() {
		return new VkCmdProcessCommandsInfoNVX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkCmdProcessCommandsInfoNVX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkCmdProcessCommandsInfoNVX create(long address) {
		return address == NULL ? null : new VkCmdProcessCommandsInfoNVX(address, null);
	}

	/**
	 * Returns a new {@link VkCmdProcessCommandsInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCmdProcessCommandsInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCmdProcessCommandsInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkCmdProcessCommandsInfoNVX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkCmdProcessCommandsInfoNVX} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkCmdProcessCommandsInfoNVX mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkCmdProcessCommandsInfoNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkCmdProcessCommandsInfoNVX callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkCmdProcessCommandsInfoNVX} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkCmdProcessCommandsInfoNVX mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkCmdProcessCommandsInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkCmdProcessCommandsInfoNVX callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkCmdProcessCommandsInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkCmdProcessCommandsInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkCmdProcessCommandsInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCmdProcessCommandsInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkCmdProcessCommandsInfoNVX.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkCmdProcessCommandsInfoNVX.PNEXT); }
	/** Unsafe version of {@link #objectTable}. */
	public static long nobjectTable(long struct) { return memGetLong(struct + VkCmdProcessCommandsInfoNVX.OBJECTTABLE); }
	/** Unsafe version of {@link #indirectCommandsLayout}. */
	public static long nindirectCommandsLayout(long struct) { return memGetLong(struct + VkCmdProcessCommandsInfoNVX.INDIRECTCOMMANDSLAYOUT); }
	/** Unsafe version of {@link #indirectCommandsTokenCount}. */
	public static int nindirectCommandsTokenCount(long struct) { return memGetInt(struct + VkCmdProcessCommandsInfoNVX.INDIRECTCOMMANDSTOKENCOUNT); }
	/** Unsafe version of {@link #pIndirectCommandsTokens}. */
	public static VkIndirectCommandsTokenNVX.Buffer npIndirectCommandsTokens(long struct, int capacity) { return VkIndirectCommandsTokenNVX.create(memGetAddress(struct + VkCmdProcessCommandsInfoNVX.PINDIRECTCOMMANDSTOKENS), capacity); }
	/** Unsafe version of {@link #maxSequencesCount}. */
	public static int nmaxSequencesCount(long struct) { return memGetInt(struct + VkCmdProcessCommandsInfoNVX.MAXSEQUENCESCOUNT); }
	/** Unsafe version of {@link #targetCommandBuffer}. */
	public static long ntargetCommandBuffer(long struct) { return memGetAddress(struct + VkCmdProcessCommandsInfoNVX.TARGETCOMMANDBUFFER); }
	/** Unsafe version of {@link #sequencesCountBuffer}. */
	public static long nsequencesCountBuffer(long struct) { return memGetLong(struct + VkCmdProcessCommandsInfoNVX.SEQUENCESCOUNTBUFFER); }
	/** Unsafe version of {@link #sequencesCountOffset}. */
	public static long nsequencesCountOffset(long struct) { return memGetLong(struct + VkCmdProcessCommandsInfoNVX.SEQUENCESCOUNTOFFSET); }
	/** Unsafe version of {@link #sequencesIndexBuffer}. */
	public static long nsequencesIndexBuffer(long struct) { return memGetLong(struct + VkCmdProcessCommandsInfoNVX.SEQUENCESINDEXBUFFER); }
	/** Unsafe version of {@link #sequencesIndexOffset}. */
	public static long nsequencesIndexOffset(long struct) { return memGetLong(struct + VkCmdProcessCommandsInfoNVX.SEQUENCESINDEXOFFSET); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkCmdProcessCommandsInfoNVX.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkCmdProcessCommandsInfoNVX.PNEXT, value); }
	/** Unsafe version of {@link #objectTable(long) objectTable}. */
	public static void nobjectTable(long struct, long value) { memPutLong(struct + VkCmdProcessCommandsInfoNVX.OBJECTTABLE, value); }
	/** Unsafe version of {@link #indirectCommandsLayout(long) indirectCommandsLayout}. */
	public static void nindirectCommandsLayout(long struct, long value) { memPutLong(struct + VkCmdProcessCommandsInfoNVX.INDIRECTCOMMANDSLAYOUT, value); }
	/** Unsafe version of {@link #indirectCommandsTokenCount(int) indirectCommandsTokenCount}. */
	public static void nindirectCommandsTokenCount(long struct, int value) { memPutInt(struct + VkCmdProcessCommandsInfoNVX.INDIRECTCOMMANDSTOKENCOUNT, value); }
	/** Unsafe version of {@link #pIndirectCommandsTokens(VkIndirectCommandsTokenNVX.Buffer) pIndirectCommandsTokens}. */
	public static void npIndirectCommandsTokens(long struct, VkIndirectCommandsTokenNVX.Buffer value) { memPutAddress(struct + VkCmdProcessCommandsInfoNVX.PINDIRECTCOMMANDSTOKENS, value.address()); }
	/** Unsafe version of {@link #maxSequencesCount(int) maxSequencesCount}. */
	public static void nmaxSequencesCount(long struct, int value) { memPutInt(struct + VkCmdProcessCommandsInfoNVX.MAXSEQUENCESCOUNT, value); }
	/** Unsafe version of {@link #targetCommandBuffer(VkCommandBuffer) targetCommandBuffer}. */
	public static void ntargetCommandBuffer(long struct, VkCommandBuffer value) { memPutAddress(struct + VkCmdProcessCommandsInfoNVX.TARGETCOMMANDBUFFER, addressSafe(value)); }
	/** Unsafe version of {@link #sequencesCountBuffer(long) sequencesCountBuffer}. */
	public static void nsequencesCountBuffer(long struct, long value) { memPutLong(struct + VkCmdProcessCommandsInfoNVX.SEQUENCESCOUNTBUFFER, value); }
	/** Unsafe version of {@link #sequencesCountOffset(long) sequencesCountOffset}. */
	public static void nsequencesCountOffset(long struct, long value) { memPutLong(struct + VkCmdProcessCommandsInfoNVX.SEQUENCESCOUNTOFFSET, value); }
	/** Unsafe version of {@link #sequencesIndexBuffer(long) sequencesIndexBuffer}. */
	public static void nsequencesIndexBuffer(long struct, long value) { memPutLong(struct + VkCmdProcessCommandsInfoNVX.SEQUENCESINDEXBUFFER, value); }
	/** Unsafe version of {@link #sequencesIndexOffset(long) sequencesIndexOffset}. */
	public static void nsequencesIndexOffset(long struct, long value) { memPutLong(struct + VkCmdProcessCommandsInfoNVX.SEQUENCESINDEXOFFSET, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		check(memGetAddress(struct + VkCmdProcessCommandsInfoNVX.PINDIRECTCOMMANDSTOKENS));
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

	/** An array of {@link VkCmdProcessCommandsInfoNVX} structs. */
	public static class Buffer extends StructBuffer<VkCmdProcessCommandsInfoNVX, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkCmdProcessCommandsInfoNVX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkCmdProcessCommandsInfoNVX#SIZEOF}, and its mark will be undefined.
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
		protected VkCmdProcessCommandsInfoNVX newInstance(long address) {
			return new VkCmdProcessCommandsInfoNVX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkCmdProcessCommandsInfoNVX.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkCmdProcessCommandsInfoNVX.npNext(address()); }
		/** Returns the value of the {@code objectTable} field. */
		public long objectTable() { return VkCmdProcessCommandsInfoNVX.nobjectTable(address()); }
		/** Returns the value of the {@code indirectCommandsLayout} field. */
		public long indirectCommandsLayout() { return VkCmdProcessCommandsInfoNVX.nindirectCommandsLayout(address()); }
		/** Returns the value of the {@code indirectCommandsTokenCount} field. */
		public int indirectCommandsTokenCount() { return VkCmdProcessCommandsInfoNVX.nindirectCommandsTokenCount(address()); }
		/**
		 * Returns a {@link VkIndirectCommandsTokenNVX.Buffer} view of the struct array pointed to by the {@code pIndirectCommandsTokens} field.
		 *
		 * @param capacity the number of elements in the returned buffer
		 */
		public VkIndirectCommandsTokenNVX.Buffer pIndirectCommandsTokens(int capacity) { return VkCmdProcessCommandsInfoNVX.npIndirectCommandsTokens(address(), capacity); }
		/** Returns the value of the {@code maxSequencesCount} field. */
		public int maxSequencesCount() { return VkCmdProcessCommandsInfoNVX.nmaxSequencesCount(address()); }
		/** Returns the value of the {@code targetCommandBuffer} field. */
		public long targetCommandBuffer() { return VkCmdProcessCommandsInfoNVX.ntargetCommandBuffer(address()); }
		/** Returns the value of the {@code sequencesCountBuffer} field. */
		public long sequencesCountBuffer() { return VkCmdProcessCommandsInfoNVX.nsequencesCountBuffer(address()); }
		/** Returns the value of the {@code sequencesCountOffset} field. */
		public long sequencesCountOffset() { return VkCmdProcessCommandsInfoNVX.nsequencesCountOffset(address()); }
		/** Returns the value of the {@code sequencesIndexBuffer} field. */
		public long sequencesIndexBuffer() { return VkCmdProcessCommandsInfoNVX.nsequencesIndexBuffer(address()); }
		/** Returns the value of the {@code sequencesIndexOffset} field. */
		public long sequencesIndexOffset() { return VkCmdProcessCommandsInfoNVX.nsequencesIndexOffset(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkCmdProcessCommandsInfoNVX.Buffer sType(int value) { VkCmdProcessCommandsInfoNVX.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkCmdProcessCommandsInfoNVX.Buffer pNext(long value) { VkCmdProcessCommandsInfoNVX.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code objectTable} field. */
		public VkCmdProcessCommandsInfoNVX.Buffer objectTable(long value) { VkCmdProcessCommandsInfoNVX.nobjectTable(address(), value); return this; }
		/** Sets the specified value to the {@code indirectCommandsLayout} field. */
		public VkCmdProcessCommandsInfoNVX.Buffer indirectCommandsLayout(long value) { VkCmdProcessCommandsInfoNVX.nindirectCommandsLayout(address(), value); return this; }
		/** Sets the specified value to the {@code indirectCommandsTokenCount} field. */
		public VkCmdProcessCommandsInfoNVX.Buffer indirectCommandsTokenCount(int value) { VkCmdProcessCommandsInfoNVX.nindirectCommandsTokenCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkIndirectCommandsTokenNVX.Buffer} to the {@code pIndirectCommandsTokens} field. */
		public VkCmdProcessCommandsInfoNVX.Buffer pIndirectCommandsTokens(VkIndirectCommandsTokenNVX.Buffer value) { VkCmdProcessCommandsInfoNVX.npIndirectCommandsTokens(address(), value); return this; }
		/** Sets the specified value to the {@code maxSequencesCount} field. */
		public VkCmdProcessCommandsInfoNVX.Buffer maxSequencesCount(int value) { VkCmdProcessCommandsInfoNVX.nmaxSequencesCount(address(), value); return this; }
		/** Sets the specified value to the {@code targetCommandBuffer} field. */
		public VkCmdProcessCommandsInfoNVX.Buffer targetCommandBuffer(VkCommandBuffer value) { VkCmdProcessCommandsInfoNVX.ntargetCommandBuffer(address(), value); return this; }
		/** Sets the specified value to the {@code sequencesCountBuffer} field. */
		public VkCmdProcessCommandsInfoNVX.Buffer sequencesCountBuffer(long value) { VkCmdProcessCommandsInfoNVX.nsequencesCountBuffer(address(), value); return this; }
		/** Sets the specified value to the {@code sequencesCountOffset} field. */
		public VkCmdProcessCommandsInfoNVX.Buffer sequencesCountOffset(long value) { VkCmdProcessCommandsInfoNVX.nsequencesCountOffset(address(), value); return this; }
		/** Sets the specified value to the {@code sequencesIndexBuffer} field. */
		public VkCmdProcessCommandsInfoNVX.Buffer sequencesIndexBuffer(long value) { VkCmdProcessCommandsInfoNVX.nsequencesIndexBuffer(address(), value); return this; }
		/** Sets the specified value to the {@code sequencesIndexOffset} field. */
		public VkCmdProcessCommandsInfoNVX.Buffer sequencesIndexOffset(long value) { VkCmdProcessCommandsInfoNVX.nsequencesIndexOffset(address(), value); return this; }

	}

}