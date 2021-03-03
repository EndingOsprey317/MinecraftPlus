package net.ospreymods.mp.procedures;

import net.ospreymods.mp.block.GraphiteBlock;
import net.ospreymods.mp.MpModElements;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.function.Supplier;
import java.util.Map;

@MpModElements.ModElement.Tag
public class ReactionTableCraftProcedure extends MpModElements.ModElement {
	public ReactionTableCraftProcedure(MpModElements instance) {
		super(instance, 68);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ReactionTableCraft!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double iis1 = 0;
		double iis2 = 0;
		double iis3 = 0;
		double iis4 = 0;
		double iis5 = 0;
		double iis6 = 0;
		double iis7 = 0;
		double iis8 = 0;
		double iis9 = 0;
		double iis10 = 0;
		double iis11 = 0;
		if (((new ItemStack(Items.LAVA_BUCKET, (int) (1)).getItem() == (new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem()) && (new ItemStack(Blocks.TNT, (int) (1)).getItem() == (new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem()))) {
			if (((new ItemStack(Blocks.AIR, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (2))).getItem()) && ((new ItemStack(Blocks.AIR, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (3))).getItem()) && ((new ItemStack(Blocks.AIR, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (4))).getItem()) && ((new ItemStack(Blocks.AIR, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (5))).getItem()) && ((new ItemStack(GraphiteBlock.block, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (6))).getItem()) && ((new ItemStack(Blocks.AIR, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (7))).getItem()) && ((new ItemStack(Blocks.AIR, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (8))).getItem()) && ((new ItemStack(Blocks.AIR, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (9))).getItem()) && ((new ItemStack(Blocks.AIR, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (10))).getItem()) && ((new ItemStack(Blocks.AIR, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (11))).getItem()) || (new ItemStack(Items.DIAMOND, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (11))).getItem())))))))))))) {
				iis1 = (double) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (1)));
				iis6 = (double) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (6)));
				iis11 = (double) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (11)));
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (0))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(Blocks.TNT, (int) (1));
							_setstack.setCount((int) ((iis1) - 1));
							((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(GraphiteBlock.block, (int) (1));
							_setstack.setCount((int) ((iis6) - 1));
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				iis1 = (double) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (1)));
				iis2 = (double) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (2)));
				iis3 = (double) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (3)));
				iis4 = (double) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (4)));
				iis5 = (double) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (5)));
				iis6 = (double) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (6)));
				iis7 = (double) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (7)));
				iis8 = (double) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (8)));
				iis9 = (double) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (9)));
				iis10 = (double) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (10)));
				iis11 = (double) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (11)));
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(Items.DIAMOND, (int) (1));
							_setstack.setCount((int) ((iis11) + 1));
							((Slot) ((Map) invobj).get((int) (11))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
		}
	}
}
